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

    // this registers the objects
    public static final RegistryObject<Item> KYLAN = ITEMS.register("kylan",
         () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JORDAN = ITEMS.register("jordan",
         () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HARRY = ITEMS.register("harry",
            () -> new Item(new Item.Properties()));


    // register all the armor with proper materials and armor type
    public static final RegistryObject<Item> JORDAN_HELMET = ITEMS.register("jordan_helmet",
                () -> new ArmorItem(ModArmorMaterials.JORDAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> JORDAN_CHESTPLATE = ITEMS.register("jordan_chestplate",
            () -> new ArmorItem(ModArmorMaterials.JORDAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> JORDAN_LEGGINGS = ITEMS.register("jordan_leggings",
            () -> new ArmorItem(ModArmorMaterials.JORDAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> JORDAN_BOOTS = ITEMS.register("jordan_boots",
            () -> new ArmorItem(ModArmorMaterials.JORDAN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> KYLAN_HELMET = ITEMS.register("kylan_helmet",
            () -> new ArmorItem(ModArmorMaterials.KYLAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> KYLAN_CHESTPLATE = ITEMS.register("kylan_chestplate",
            () -> new ArmorItem(ModArmorMaterials.KYLAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> KYLAN_LEGGINGS = ITEMS.register("kylan_leggings",
            () -> new ArmorItem(ModArmorMaterials.KYLAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> KYLAN_BOOTS = ITEMS.register("kylan_boots",
            () -> new ArmorItem(ModArmorMaterials.KYLAN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HARRY_HELMET = ITEMS.register("harry_helmet",
            () -> new ArmorItem(ModArmorMaterials.HARRY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HARRY_CHESTPLATE = ITEMS.register("harry_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HARRY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HARRY_LEGGINGS = ITEMS.register("harry_leggings",
            () -> new ArmorItem(ModArmorMaterials.HARRY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HARRY_BOOTS = ITEMS.register("harry_boots",
            () -> new ArmorItem(ModArmorMaterials.HARRY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> KYLANFOOD = ITEMS.register("kylan_food",
            () -> new Item(new Item.Properties().food(ModFoods.KYLANFOOD)));
    public static final RegistryObject<Item> JORDANFOOD = ITEMS.register("jordan_food",
            () -> new Item(new Item.Properties().food(ModFoods.JORDANFOOD)));
    public static final RegistryObject<Item> HARRYFOOD = ITEMS.register("harry_food",
            () -> new Item(new Item.Properties().food(ModFoods.HARRYFOOD)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);    
    }
}
