package useless.armorplus.mixin;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import useless.prismaticlibe.IColored;

@Mixin(value = ItemArmor.class, remap = false)
public class mixinArmor extends Item implements IColored {

    @Unique
    public int[] baseTexture = new int[2];
    public mixinArmor(int id) {
        super(id);
    }

    @Override
    public Item setIconCoord(int x, int y) {
        baseTexture[0] = x;
        baseTexture[1] = y;
        return super.setIconCoord(x, y);
    }

    @Override
    public int baseColor() {
        return 0xFFFFFF;
    }

    @Override
    public int overlayColor() {
        return 0;
    }

    @Override
    public int[] baseTexture() {
        return baseTexture;
    }

    @Override
    public int[] overlayTexture() {
        return new int[2];
    }
}
