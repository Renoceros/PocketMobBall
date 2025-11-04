package com.pocketmobball.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import com.pocketmobball.registry.ModEntities;
import com.pocketmobball.registry.ModItems;

public class PomoballEntity extends ThrownItemEntity {

    public PomoballEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public PomoballEntity(World world, LivingEntity owner) {
        super(ModEntities.POMOBALL, owner, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.POMOBALL;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        // TODO: capture mob logic
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
        // TODO: spawn captured mob logic
        this.discard();
    }
}
