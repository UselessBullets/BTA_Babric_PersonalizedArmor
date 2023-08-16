package useless.armorplus;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.TextureHelper;


public class ArmorPlus implements ModInitializer {

    public static final String MOD_ID = "armorplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final int[] itemTrimBoots = TextureHelper.registerItemTexture(MOD_ID, "itemTrims/boots_trim.png");
    public static final int[] itemTrimLegs = TextureHelper.registerItemTexture(MOD_ID, "itemTrims/leggings_trim.png");
    public static final int[] itemTrimChest = TextureHelper.registerItemTexture(MOD_ID, "itemTrims/chestplate_trim.png");
    public static final int[] itemTrimHelmet = TextureHelper.registerItemTexture(MOD_ID, "itemTrims/helmet_trim.png");

    @Override
    public void onInitialize() {
        LOGGER.info("ArmorPlus initialized.");
    }
}
