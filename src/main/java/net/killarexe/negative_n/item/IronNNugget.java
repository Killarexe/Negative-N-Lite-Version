package net.killarexe.negative_n.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killarexe.negative_n.register.NegativeNItemGroups;
import net.minecraft.item.Item;

public class IronNNugget extends Item {

    public IronNNugget() {
        super(new FabricItemSettings().group(NegativeNItemGroups.MISC));
    }
}
