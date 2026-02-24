package net.BreesyCreates.breesycreatesmod.item;

import net.BreesyCreates.breesycreatesmod.TrialMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TrialMod.MODID);

    public static final DeferredItem<Item> BREESIUM = ITEMS.register("breesium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BREESIUM_INGOT = ITEMS.register("breesium_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
