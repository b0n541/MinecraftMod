package net.b0n541.minecraftmod.item;

import net.b0n541.minecraftmod.MinecraftMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecraftMod.MODID);

    public static final RegistryObject<CreativeModeTab> SAPPHIRE_CREATIVE_MODE_TAB =
            CREATIVE_MODE_TABS.register("sapphire_creative_mode_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                            .title(Component.translatable("creativetab.minecraftmod.sapphire_tab_title"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.SAPPHIRE.get());
                                output.accept(ModItems.RAW_SAPPHIRE.get());
                            })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
