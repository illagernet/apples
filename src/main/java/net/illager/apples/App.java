package net.illager.apples;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.Bukkit;

public class App extends JavaPlugin {

    @Override
    public void onEnable() {
        NamespacedKey key = new NamespacedKey(this, "illager");
        ItemStack item = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
        ShapedRecipe recipe = new ShapedRecipe(key, item);

        recipe.shape("GGG", "GAG", "GGG");
        recipe.setIngredient('G', Material.GOLD_BLOCK);
        recipe.setIngredient('A', Material.APPLE);

        Bukkit.addRecipe(recipe);
    }

    @Override
    public void onDisable() {
    }
}
