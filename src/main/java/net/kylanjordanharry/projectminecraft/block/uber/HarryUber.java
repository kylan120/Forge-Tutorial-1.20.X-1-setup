package net.kylanjordanharry.projectminecraft.block.uber;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class HarryUber extends Block {
    public HarryUber(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer,
                                 InteractionHand pHand, BlockHitResult pHit) {
        pLevel.setRainLevel(1.0F);
        pPlayer.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 10000));
        pLevel.playSound(pPlayer, pPos, SoundEvents.WARDEN_SONIC_BOOM, SoundSource.BLOCKS);
        return InteractionResult.SUCCESS;
    }
}
