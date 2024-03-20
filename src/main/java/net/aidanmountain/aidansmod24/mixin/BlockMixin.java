package net.aidanmountain.aidansmod24.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.world.level.block.Block;


@Mixin(Block.class)
public class BlockMixin {
  @Inject(at = @At(value = "HEAD"), method = "Lnet/minecraft/world/level/block/state/BlockBehavior;friction()f", cancellable = true)
  protected float friction(CallbackInfo info){
    info.cancel();
    return 0.02f;
  }
}
