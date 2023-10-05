package net.kylanjordanharry.projectminecraft.item;

import net.kylanjordanharry.projectminecraft.project;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
// Name: Kylan, Harry, and Jordan
//Description: This is the mod items class
//Date: 9/28/2023
public class ModItems 
{
    //DeferredRegister is a long list of things, basically when forge registers the items.
    public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, project.MOD_ID);

    // this registers the object
 public static final RegistryObject<Item> KYLAN = ITEMS.register("kylan",
         () -> new Item(new Item.Properties()));
 public static final RegistryObject<Item> JORDAN = ITEMS.register("jordan",
         () -> new Item(new Item.Properties()));

public static final RegistryObject<Item> HARRY = ITEMS.register("harry",
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);    
    }
}
