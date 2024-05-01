package net.aidanmountain.aidansmod24.Item;

import net.aidanmountain.aidansmod24.ExampleMod;
import net.aidanmountain.aidansmod24.Item.custom.HockeyStickItem;
import net.aidanmountain.aidansmod24.Item.custom.MetalDetectorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    //Named skates but should be named something else, creates an item that right now is nothing
    public static final RegistryObject<Item> HOCKEY = ITEMS.register("hockey", 
    () -> new Item(new Item.Properties()));

    //creates the armor that is the hockey gear
    public static final RegistryObject<Item> HOCKEY_HELMET = ITEMS.register("hockey_helmet",
        () -> new ArmorItem(ModArmorMaterials.HOCKEY, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> HOCKEY_CHESTPLATE = ITEMS.register("hockey_chestplate",
        () -> new ArmorItem(ModArmorMaterials.HOCKEY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> HOCKEY_LEGGINGS = ITEMS.register("hockey_leggings",
        () -> new ArmorItem(ModArmorMaterials.HOCKEY, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> HOCKEY_BOOTS = ITEMS.register("hockey_boots",
        () -> new ArmorItem(ModArmorMaterials.HOCKEY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HOCKEY_STICK = ITEMS.register("hockey_stick",
        () -> new HockeyStickItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> HOCKEY_STICKS = ITEMS.register("hockey_sticks",
        () -> new HockeyStickItems(new Item.Properties().durability(100)));
    
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    //public static final RegistryObject<Item> NEWICE_BLOCK = ITEMS.register("newice_block",
    //() -> new Item(new Item.Properties()));
    
    public static void register(IEventBus eventBus ){
        ITEMS.register(eventBus);
    }
}