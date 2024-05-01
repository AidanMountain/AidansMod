package net.aidanmountain.aidansmod24.entity;
import net.aidanmountain.aidansmod24.ExampleMod;
import net.aidanmountain.aidansmod24.entity.custom.HockeyPuck;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntity {
        public static DeferredRegister<EntityType<?>> ENTITY_TYPES 
        = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ExampleMod.MODID);
    
        public static final RegistryObject<EntityType<HockeyPuck>> HOCKEY_PUCK = ENTITY_TYPES.register("hockey_puck",
            () -> EntityType.Builder.of((EntityType.EntityFactory<HockeyPuck>) HockeyPuck::new, MobCategory.MISC).sized(0.5F, 0.5F).build("hockey_puck"));
    
    
        public static void register(IEventBus eventBus){
            ENTITY_TYPES.register(eventBus);
        }
    }