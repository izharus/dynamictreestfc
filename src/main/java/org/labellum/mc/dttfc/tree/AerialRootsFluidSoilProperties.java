package org.labellum.mc.dttfc.tree;

import com.ferreusveritas.dynamictrees.api.registry.TypedRegistry;
import com.ferreusveritas.dynamictrees.block.rooty.AerialRootsSoilProperties;
import com.ferreusveritas.dynamictrees.block.rooty.RootyBlock;
import com.ferreusveritas.dynamictrees.block.rooty.SoilProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class AerialRootsFluidSoilProperties extends AerialRootsSoilProperties
{
    public static final TypedRegistry.EntryType<SoilProperties> TFC_TYPE = TypedRegistry.newType(AerialRootsFluidSoilProperties::new);

    public AerialRootsFluidSoilProperties(ResourceLocation registryName)
    {
        super(registryName);
    }

    @Override
    protected RootyBlock createBlock(BlockBehaviour.Properties blockProperties)
    {
        return new RootyRootFluidBlock(this, blockProperties);
    }
}
