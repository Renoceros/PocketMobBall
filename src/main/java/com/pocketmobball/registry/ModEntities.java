package com.pocketmobball.registry;

import com.pocketmobball.Pomoball;
import com.pocketmobball.entity.PomoballEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<PomoballEntity> POMOBALL_ENTITY_TYPE =
        Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(Pomoball.MOD_ID, "pomoball_entity"),
            EntityType.Builder.<PomoballEntity>create(PomoballEntity::new, SpawnGroup.MISC)
                .dimensions(0.25f, 0.25f)
                .build()
        );

    public static void init() {}
}
