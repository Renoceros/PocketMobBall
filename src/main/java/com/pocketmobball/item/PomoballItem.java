package com.pocketmobball.item;

// import com.pocketmobball.registry.ModEntities;
// import com.pocketmobball.entity.PomoballEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
// import net.minecraft.sound.SoundCategory;
// import net.minecraft.sound.SoundEvents;
// import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class PomoballItem extends Item {
    public PomoballItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (!world.isClient) {
            SnowballEntity snowball = new SnowballEntity(world, user);
            snowball.setItem(itemStack);
            snowball.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 1.0F);
            world.spawnEntity(snowball);
        }
        user.getItemCooldownManager().set(this, 20); // 1s cooldown
        return TypedActionResult.success(itemStack, world.isClient());
    }

}
