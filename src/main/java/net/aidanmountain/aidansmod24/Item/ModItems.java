package net.aidanmountain.aidansmod24.Item;

import net.aidanmountain.aidansmod24.ExampleMod;
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
    
    public static void register(IEventBus eventBus ){
        ITEMS.register(eventBus);
    }
}