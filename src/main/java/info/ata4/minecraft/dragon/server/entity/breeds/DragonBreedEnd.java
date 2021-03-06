/*
 ** 2013 October 24
 **
 ** The author disclaims copyright to this source code.  In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package info.ata4.minecraft.dragon.server.entity.breeds;

import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.world.biome.BiomeGenBase;

/**
 *
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public class DragonBreedEnd extends DragonBreed {

    public DragonBreedEnd() {
        super("end", "ender", 0xab39be);
        
        addImmunity(DamageSource.magic);
        
        addHabitatBlock(Blocks.end_stone);
        addHabitatBlock(Blocks.obsidian);
        addHabitatBiome(BiomeGenBase.sky);
    }

}
