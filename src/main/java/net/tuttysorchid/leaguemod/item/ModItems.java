package net.tuttysorchid.leaguemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tuttysorchid.leaguemod.LeagueMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LeagueMod.MODID);

    public static final RegistryObject<Item> BLUECARD = ITEMS.register("bluecard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDCARD = ITEMS.register("redcard",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
