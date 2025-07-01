package asia.a951.registry;

import asia.a951.DemoMod159;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

//添加一个自己的物品栏栏位
public class ModItemGroup {
        public static final RegistryKey<ItemGroup> VCX_GROUP = register("vcx_froup");
        private static RegistryKey<ItemGroup> register(String id) {
            return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(DemoMod159.MOD_ID, id));
        }
    public static void registerGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                VCX_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.demomod159.VCX"))
                        .icon(() -> new ItemStack(ModItems.ywj))
                        .entries((displayContext, entries) -> {
                            //添加一个物品到自己的槽位,格式为:entries.add(ModItems.物品ID);
                            entries.add(ModItems.ywj);
                            entries.add(ModItems.soda);
                            entries.add(ModItems.yses);
                            entries.add(ModItems.shuisheng);
                            entries.add(ModItems.SX);
                            entries.add(ModItems.shenshou);
                            entries.add(ModItems.xixi);
                            entries.add(ModItems.Loser_obs);
                            entries.add(ModItems.Normal_obs);
                            entries.add(ModItems.pp);
                            entries.add(ModItems.FYJ);
                            entries.add(ModItems.BG);
                            entries.add(ModItems.str);
                            entries.add(ModItems.PCO);
                        })
                        .build());
    }



    public static void registerModItemGroup(){
        DemoMod159.LOGGER.debug("Registering mod item group for" + DemoMod159.MOD_ID);
    }
}

