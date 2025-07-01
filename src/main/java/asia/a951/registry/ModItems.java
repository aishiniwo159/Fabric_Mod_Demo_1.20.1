//下面是包的来源
package asia.a951.registry;

//下面是调用的import
import asia.a951.DemoMod159;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;


//下面是新建一个物品 格式为:public static final Item 物品名称 = registerItem("物品看见的名称",new Item(new FabricItemSettings()))
public class ModItems {
    public static final Item Normal_obs = registerItem("normal_obs",new Item(new FabricItemSettings()));
    public static final Item Loser_obs = registerItem("loser_obs",new Item(new FabricItemSettings()));
    public static final Item PCO = registerItem("pink_cat_ouo",new Item(new FabricItemSettings()));
    public static final Item xixi= registerItem("xixi",new Item(new FabricItemSettings()));
    public static final Item yses = registerItem("1324",new Item(new FabricItemSettings()));
    public static final Item pp = registerItem("pp",new Item(new FabricItemSettings()));
    public static final Item ywj = registerItem("159",new Item(new FabricItemSettings()));
    public static final Item SX = registerItem("sx",new Item(new FabricItemSettings()));
    public static final Item FYJ = registerItem("fyj",new Item(new FabricItemSettings()));
    public static final Item BG = registerItem("bg",new Item(new FabricItemSettings()));
    public static final Item str = registerItem("str",new Item(new FabricItemSettings()));
    public static final Item soda = registerItem("soda",new Item(new FabricItemSettings()));
    public static final Item shuisheng = registerItem("shuisheng",new Item(new FabricItemSettings()));
    public static final Item shenshou = registerItem("shenshou",new Item(new FabricItemSettings()));
    public static Item registerItem(String name, Item item, RegistryKey<ItemGroup>... itemGroups){
        Item registerItem = Registry.register(Registries.ITEM,new Identifier(DemoMod159.MOD_ID,name),item);
        for (RegistryKey<ItemGroup> itemGroup:itemGroups){
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registerItem));
        }
        return registerItem;
    }

    //下面是把物品添加到物品栏,写一个物品加一个
    private static void addItemToItemGroup(FabricItemGroupEntries entries) {

    //entries.add(物品ID);

    }

    //以下是把上面添加的物品添加到指定一个栏位
    public static void registerItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemToItemGroup);
        DemoMod159.LOGGER.debug("Registering mod items for" + DemoMod159.MOD_ID);
    }
}
//1324的作用：获得书与笔 并且名字为翼张答题卡 | 博哥可以和风油精合成获得烧鸡(BUFF名称:积极热 效果:速度+凋零+脚底放火) | 水系的作用:右键击杀10方块内的所有马
