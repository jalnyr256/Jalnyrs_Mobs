package net.jalnyr.jalnyrsmobs.entity.custom;

import net.jalnyr.jalnyrsmobs.entity.ai.InternalAttackGoal;
import net.jalnyr.jalnyrsmobs.entity.ai.InternalStateGoal;
import net.jalnyr.jalnyrsmobs.sound.ModSounds;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.world.BossEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.SnowGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CorruptedGuardEntity extends Internal_Animation_Monster{
    private static final EntityDataAccessor<Boolean> ATTACKING =
            SynchedEntityData.defineId(CorruptedGuardEntity.class, EntityDataSerializers.BOOLEAN);
    public AnimationState idleAnimationState = new AnimationState();
    public int idleAnimationTimeout = 0;
    public AnimationState attackAnimationState = new AnimationState();
    public int attackAnimationTimeout = 0;
    public AnimationState attack2AnimationState = new AnimationState();
    public AnimationState attack3AnimationState = new AnimationState();
    public AnimationState attack4AnimationState = new AnimationState();
    private int attack_cooldown = 0;
    public static final int ATTACK_COOLDOWN = 20;

    private final ServerBossEvent bossEvent  = new ServerBossEvent(Component.literal("Corrupted Guard"),
            BossEvent.BossBarColor.WHITE, BossEvent.BossBarOverlay.PROGRESS);

    public int attackDamageModifier = 8;

    public CorruptedGuardEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(5, new RandomStrollGoal(this, 1.0D, 80));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        //x slash
        this.goalSelector.addGoal(1, new InternalAttackGoal(this,0,1,0,40,15,3.6F){
            @Override
            public boolean canUse() {
                return super.canUse() && CorruptedGuardEntity.this.getRandom().nextFloat() * 100.0F < 40f;
            }

        });
        this.goalSelector.addGoal(1, new InternalAttackGoal(this,0,4,0,60,15,3.6F){
            @Override
            public boolean canUse() {
                return super.canUse() && CorruptedGuardEntity.this.getRandom().nextFloat() * 100.0F < 40f;
            }

        });
        this.goalSelector.addGoal(1, new InternalAttackGoal(this,0,3,0,50,15,3.6F){
            @Override
            public boolean canUse() {
                return super.canUse() && CorruptedGuardEntity.this.getRandom().nextFloat() * 100.0F < 30f;
            }

            @Override
            public void stop() {
                super.stop();
                CorruptedGuardEntity.this.attack_cooldown = ATTACK_COOLDOWN;
            }

        });
        this.goalSelector.addGoal(1, new InternalAttackGoal(this,0,2,0,50,50,4.5F) {
            @Override
            public boolean canUse() {
                return super.canUse() && CorruptedGuardEntity.this.getRandom().nextFloat() * 100.0F < 40f && CorruptedGuardEntity.this.attack_cooldown <= 0;
            }

            @Override
            public void stop() {
                super.stop();
                CorruptedGuardEntity.this.attack_cooldown = ATTACK_COOLDOWN;
            }
        });
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this).setAlertOthers());
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, SnowGolem.class, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillager.class, false));
    }

    public static AttributeSupplier.Builder CreateAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 30.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25F)
                .add(Attributes.ATTACK_DAMAGE, 8D)
                .add(Attributes.MAX_HEALTH, 500D)
                .add(Attributes.ARMOR, 12)
                .add(Attributes.ATTACK_SPEED, 1D)
                .add(Attributes.ATTACK_KNOCKBACK, 1D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 3);
    }

    public @NotNull MobType getMobType() {
        return MobType.UNDEAD;
    }


    public AnimationState getAnimationState(String input) {
        if (input == "attack") {
            return this.attackAnimationState;
        } else if (input == "attack2") {
            return this.attack2AnimationState;
        } else if (input == "attack3") {
            return this.attack3AnimationState;
        } else if (input == "attack4") {
            return this.attack4AnimationState;
        } else if (input == "idle") {
            return this.idleAnimationState;
        } else {
            return new AnimationState();
        }
    }
    public void onSyncedDataUpdated(EntityDataAccessor<?> p_21104_) {
        if (ATTACK_STATE.equals(p_21104_)) {
            switch (this.getAttackState()) {
                case 0 -> this.stopAllAnimationStates();
                case 1 -> {
                    this.stopAllAnimationStates();
                    this.attackAnimationState.startIfStopped(this.tickCount);
                }
                case 2 -> {
                    this.stopAllAnimationStates();
                    this.attack2AnimationState.startIfStopped(this.tickCount);
                }
                case 3 -> {
                    this.stopAllAnimationStates();
                    this.attack3AnimationState.startIfStopped(this.tickCount);
                }
                case 4 -> {
                    this.stopAllAnimationStates();
                    this.attack4AnimationState.startIfStopped(this.tickCount);
                }
            }
        }

        super.onSyncedDataUpdated(p_21104_);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
    }




    public void stopAllAnimationStates() {
        this.idleAnimationState.stop();
        this.attackAnimationState.stop();
        this.attack2AnimationState.stop();
        this.attack3AnimationState.stop();
        this.attack4AnimationState.stop();
    }


    public void handleEntityEvent(byte p_219360_) {
        this.attackAnimationState.start(this.tickCount);
        this.attack2AnimationState.start(this.tickCount);
        this.attack3AnimationState.start(this.tickCount);
        this.attack4AnimationState.start(this.tickCount);
    }

    public boolean doHurtTarget(Entity p_219472_) {
        this.level().broadcastEntityEvent(this, (byte) 4);
        p_219472_.hurt(p_219472_.damageSources().generic(), (this.attackDamageModifier));
        return super.doHurtTarget(p_219472_);

    }


    public void tick() {
        super.tick();
        if (this.level().isClientSide()) {
            this.idleAnimationState.animateWhen(true, this.tickCount);
        }
        if (attack_cooldown > 0) attack_cooldown--;
    }


    @Override
    public void startSeenByPlayer(ServerPlayer pServerPlayer) {
        super.startSeenByPlayer(pServerPlayer);
        this.bossEvent.addPlayer(pServerPlayer);
    }
    public void die(DamageSource p_21014_) {
        super.die(p_21014_);
        this.setAttackState(0);
    }

    @Override
    public void stopSeenByPlayer(ServerPlayer pServerPlayer) {
        super.stopSeenByPlayer(pServerPlayer);
        this.bossEvent.removePlayer(pServerPlayer);
    }
    public boolean canBePushedByEntity(Entity entity) {
        return false;
    }
    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.HIT.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return ModSounds.HIT.get();
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.HIT.get();
    }
    @Override
    public void aiStep() {
        super.aiStep();
        float dis = this.getBbWidth();

        float f1 = (float) Math.cos(Math.toRadians(this.getYRot() + 90));
        float f2 = (float) Math.sin(Math.toRadians(this.getYRot() + 90));

        if(this.getAttackState() == 1) {
            if (this.attackTicks == 17) {
                this.playSound(ModSounds.HIT.get(), 4F, 1.2f);
                AreaAttack(dis*2f,dis * 3f,200,1.5F,0);
            }
        }
        if(this.getAttackState() == 2) {
            if (this.attackTicks == 20) {
                this.playSound(ModSounds.HIT.get(), 4F, 1.2f);
                AreaAttack(dis*2.1f,dis * 3f,200,2.3F,40);
            }
        }
        if(this.getAttackState() == 3) {
            if (this.attackTicks == 20) {
                this.playSound(ModSounds.HIT.get(), 4F, 1.2f);
                AreaAttack(dis*3f,dis * 3f,200,3F,80);
            }
        }
        if(this.getAttackState() == 4) {
            if (this.attackTicks == 17) {
                this.playSound(ModSounds.HIT.get(), 4F, 1.2f);
                AreaAttack(dis*3f,dis * 3f,200,3F,80);
            }
            if (this.attackTicks == 45) {
                this.playSound(ModSounds.HIT.get(), 4F, 1.2f);
                AreaAttack(dis*3f,dis * 3f,200,3F,80);
            }
        }
        this.bossEvent.setProgress(this.getHealth() / this.getMaxHealth());
    }
    public static void disableShield(Player player, int ticks) {
        if (!player.level().isClientSide) {
            if (player.isBlocking()) {
                player.getCooldowns().addCooldown(player.getUseItem().getItem(), ticks);
                player.stopUsingItem();
                player.level().broadcastEntityEvent(player, (byte)30);
            }
        }
    }
    private void AreaAttack(float range, float height, float arc, float damage, int shieldbreakticks) {
        List<LivingEntity> entitiesHit = this.getEntityLivingBaseNearby(range, height, range, range);
        if (!this.level().isClientSide) {
            DamageSource damagesource = this.damageSources().mobAttack(this);
            for (LivingEntity entityHit : entitiesHit) {
                float entityHitAngle = (float) ((Math.atan2(entityHit.getZ() - this.getZ(), entityHit.getX() - this.getX()) * (180 / Math.PI) - 90) % 360);
                float entityAttackingAngle = this.yBodyRot % 360;
                if (entityHitAngle < 0) {
                    entityHitAngle += 360;
                }
                if (entityAttackingAngle < 0) {
                    entityAttackingAngle += 360;
                }
                float entityRelativeAngle = entityHitAngle - entityAttackingAngle;
                float entityHitDistance = (float) Math.sqrt((entityHit.getZ() - this.getZ()) * (entityHit.getZ() - this.getZ()) + (entityHit.getX() - this.getX()) * (entityHit.getX() - this.getX()));
                if (entityHitDistance <= range && (entityRelativeAngle <= arc / 2 && entityRelativeAngle >= -arc / 2) || (entityRelativeAngle >= 360 - arc / 2 || entityRelativeAngle <= -360 + arc / 2)) {
                    if (!isAlliedTo(entityHit) && !(entityHit instanceof CorruptedGuardEntity) && entityHit != this) {
                        boolean flag = entityHit.hurt(damagesource, (float) (this.getAttributeValue(Attributes.ATTACK_DAMAGE) * damage));
                    }
                    if (entityHit.isDamageSourceBlocked(damagesource) && entityHit instanceof Player player && shieldbreakticks > 0) {
                        disableShield(player, shieldbreakticks);
                    }
                }
            }
        }
    }
}
