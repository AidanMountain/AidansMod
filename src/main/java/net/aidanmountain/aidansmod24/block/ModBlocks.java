package net.aidanmountain.aidansmod24.block;

import java.util.function.Supplier;

import net.aidanmountain.aidansmod24.ExampleMod;
import net.aidanmountain.aidansmod24.Item.ModItems;
import net.aidanmountain.aidansmod24.event.IceEventHandler;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ModBlocks {
    public static float modFriction = 0.6f;
    private static final Logger LOGGER = LogUtils.getLogger();//{
    //if(Inventory. == ArmorItem.Type.BOOTS){
        //modFriction = 0.66f;
    //}}
    // != ModItems.HOCKEY_BOOTS

    //if(player.inventory.armorInventory[3].getItem() != ModItems.HOCKEY_BOOTS){modFriction = 0.99f;}

    public static DeferredRegister<Block> BLOCKS = 
        DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);

    public static final RegistryObject<Block> NEWICE_BLOCK = registerBlock("newice_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE).friction(IceEventHandler.myFriction)));
    

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));

    }
    
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
