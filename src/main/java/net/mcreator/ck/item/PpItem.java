
package net.mcreator.ck.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.ck.CkModElements;

@CkModElements.ModElement.Tag
public class PpItem extends CkModElements.ModElement {
	@ObjectHolder("ck:pp")
	public static final Item block = null;

	public PpItem(CkModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, CkModElements.sounds.get(new ResourceLocation("ck:erika")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("pp");
		}
	}
}
