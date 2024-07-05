package org.labellum.mc.dttfc.tree;

import com.ferreusveritas.dynamictrees.api.data.WaterRootGenerator;
import com.ferreusveritas.dynamictrees.api.registry.TypedRegistry;
import com.ferreusveritas.dynamictrees.block.rooty.RootyBlock;
import com.ferreusveritas.dynamictrees.block.rooty.SoilProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import org.labellum.mc.dttfc.content.RootyFluidBlock;

public class FluidSoilProperties extends SoilProperties
{
    public static final TypedRegistry.EntryType<SoilProperties> TYPE = TypedRegistry.newType(FluidSoilProperties::new);

    public FluidSoilProperties(ResourceLocation registryName)
    {
        super(null, registryName);
        this.soilStateGenerator.reset(WaterRootGenerator::new);
    }

    @Override
    protected RootyBlock createBlock(BlockBehaviour.Properties blockProperties)
    {
        return new RootyFluidBlock(this, blockProperties);
    }

    public MapColor getDefaultMapColor() {
        return MapColor.WATER;
    }

    @Override
    public BlockBehaviour.Properties getDefaultBlockProperties(MapColor mapColor)
    {
        return BlockBehaviour.Properties.copy(Blocks.WATER);
    }
}
