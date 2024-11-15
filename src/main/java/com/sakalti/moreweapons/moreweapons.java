package com.sakalti.moreweapons;

import com.sakalti.moreweapons.items.FlowerBladeItem;
import com.sakalti.moreweapons.items.UnderBladeItem;
import com.sakalti.moreweapons.items.CoralGreatswordItem;
import com.sakalti.moreweapons.items.BentDiamondBladeItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MoreWeaponsMod implements ModInitializer {
    @Override
    public void onInitialize() {
        // 各アイテムの登録
        Registry.register(Registries.ITEM, new Identifier("moreweapons", "flower_blade"), new FlowerBladeItem());
        Registry.register(Registries.ITEM, new Identifier("moreweapons", "under_blade"), new UnderBladeItem());
        Registry.register(Registries.ITEM, new Identifier("moreweapons", "coral_greatsword"), new CoralGreatswordItem());
        Registry.register(Registries.ITEM, new Identifier("moreweapons", "bent_diamond_blade"), new BentDiamondBladeItem());
    }
}
