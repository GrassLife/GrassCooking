package life.grass.grasscooking.table;

import life.grass.grasscooking.operation.Operable;
import life.grass.grasscooking.ui.MakerInterface;
import org.bukkit.block.Block;
import org.bukkit.inventory.Inventory;

public abstract class Maker extends Table implements MakerInterface, Operable {

    public Maker(Block block) {
        super(block);
    }

    @Override
    public Inventory initInventory() {
        Inventory inv = super.initInventory();

        getIngredientSpacePositionList().forEach(position -> inv.setItem(position, null));
        inv.setItem(getMakingIconPosition(), getMakingIcon());

        return inv;
    }
}