package net.aidanmountain.aidansmod24.event;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.fml.LogicalSide;

import com.mojang.logging.LogUtils;

import net.aidanmountain.aidansmod24.ExampleMod;
import net.aidanmountain.aidansmod24.block.ModBlocks;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlot.Type;
//import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import org.slf4j.Logger;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerContainerEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExampleMod.MODID)
public class IceEventHandler {
    
    //private static armor = EquipmentSlot.Type.ARMOR;
    public static float myFriction = 0.5f;
    private static final Logger LOGGER = LogUtils.getLogger();
    private Player player;
    
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event){
        
        if(event.side == LogicalSide.SERVER){
            LOGGER.info("Tick Method");
        
            if(EquipmentSlot.Type.ARMOR != null){
                myFriction = 0.5f;
            }
            if(EquipmentSlot.Type.ARMOR == null){
                myFriction = 0.99f;
            }
        }
        
    }
    
}
