package asia.a951.registry;

import asia.a951.DemoMod159;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems { //这里新建物品
    public static final Item Normal_obs = registerItem("normal_obs",          //添加物品NormalOBS
            new Item(new FabricItemSettings()));
    public static final Item Loser_obs = registerItem("loser_obs",  //添加物品Loser OBS
            new Item(new FabricItemSettings()));
    public static final Item PCO = registerItem("pink_cat_ouo",  //添加物品PCO
            new Item(new FabricItemSettings()));
    public static final Item xixi= registerItem("xixi",  //添加物品XIXI
            new Item(new FabricItemSettings()));
    public static final Item yses = registerItem("1324",
            new Item(new FabricItemSettings()));
    public static final Item pp = registerItem("pp",
            new Item(new FabricItemSettings()));
    public static final Item ywj = registerItem("159",
            new Item(new FabricItemSettings()));
    public static final Item SX = registerItem("sx",
            new Item(new FabricItemSettings()));
    public static final Item FYJ = registerItem("fyj",
            new Item(new FabricItemSettings()));
    public static final Item BG = registerItem("bg",
            new Item(new FabricItemSettings()));
    public static Item registerItem(String name, Item item, RegistryKey<ItemGroup>... itemGroups){
        Item registerItem = Registry.register(Registries.ITEM,new Identifier(DemoMod159.MOD_ID,name),item);
        for (RegistryKey<ItemGroup> itemGroup:itemGroups){
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registerItem));

        }
        return registerItem;
    }
    public static  void registerItems(){
        DemoMod159.LOGGER.debug("Registering mod items for" + DemoMod159.MOD_ID);
    }
}
