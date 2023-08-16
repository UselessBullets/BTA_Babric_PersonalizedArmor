package useless.armorplus.mixin;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import useless.armorplus.ArmorPlus;
import useless.prismaticlibe.IColored;

@Mixin(value = ItemArmor.class, remap = false)
public class mixinArmor extends Item implements IColored {

    @Unique
    public int[] baseTexture = new int[2];
    @Shadow
    public final int armorPiece;
    public mixinArmor(int id, int armorPiece) {
        super(id);
        this.armorPiece = armorPiece;
    }

    @Override
    public Item setIconCoord(int x, int y) {
        baseTexture[0] = x;
        baseTexture[1] = y;
        return super.setIconCoord(x, y);
    }

    @Override
    public int getPlacedBlockMetadata(int i) {
        return super.getPlacedBlockMetadata(i);
    }

    @Override
    public int baseColor() {
        return 0xFFFFFF;
    }

    @Override
    public int overlayColor() {
        return 0xDD0000;
    }

    @Override
    public int[] baseTexture() {
        return baseTexture;
    }

    @Override
    public int[] overlayTexture() {
        switch (armorPiece){
            case 0:
                return ArmorPlus.itemTrimHelmet;
            case 1:
                return ArmorPlus.itemTrimChest;
            case 2:
                return ArmorPlus.itemTrimLegs;
            case 3:
                return ArmorPlus.itemTrimBoots;
            default:
                return new int[] {0,4};
        }
    }
}
