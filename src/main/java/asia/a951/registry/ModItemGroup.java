package asia.a951.registry;

import asia.a951.DemoMod159;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    //暂时摆烂 可以参考https://www.bilibili.com/video/BV1Vj411S71d?spm_id_from=333.788.videopod.sections&vd_source=0dcb2ef3c4d559f16012f60de97a314d 和 https://www.bilibili.com/opus/811881469020471301 和

    public static void registerModItemGroup(){
        DemoMod159.LOGGER.debug("Registering mod item group for" + DemoMod159.MOD_ID);
    }
}

