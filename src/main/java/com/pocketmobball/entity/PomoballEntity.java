package com.pocketmobball.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import com.pocketmobball.registry.ModEntities;

public class PomoballEntity extends ThrownItemEntity {
    public PomoballEntity(EntityType<? extends ThrownItemEntity> type, World world) {
        super(type, world);
    }

    public PomoballEntity(World world, LivingEntity owner) {
        super(ModEntities.POMOBALL_ENTITY_TYPE, owner, world);
    }

    public PomoballEntity(World world, double x, double y, double z) {
        super(ModEntities.POMOBALL_ENTITY_TYPE, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return Items.SNOWBALL; // placeholder for now
    }
}
