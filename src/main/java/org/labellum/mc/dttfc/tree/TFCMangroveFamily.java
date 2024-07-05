package org.labellum.mc.dttfc.tree;

import com.ferreusveritas.dynamictrees.api.registry.TypedRegistry;
import com.ferreusveritas.dynamictrees.block.branch.BranchBlock;
import com.ferreusveritas.dynamictrees.tree.family.Family;
import com.ferreusveritas.dynamictrees.tree.family.MangroveFamily;
import net.minecraft.resources.ResourceLocation;
import org.labellum.mc.dttfc.content.TFCRootsBlock;

public class TFCMangroveFamily extends MangroveFamily
{
    public static final TypedRegistry.EntryType<Family> TFC_TYPE = TypedRegistry.newType(TFCMangroveFamily::new);

    public TFCMangroveFamily(ResourceLocation name)
    {
        super(name);
    }

    @Override
    protected BranchBlock createRootsBlock(ResourceLocation name)
    {
        final TFCRootsBlock branch = new TFCRootsBlock(name, this.getProperties());
        if (this.isFireProof())
            branch.setFireSpreadSpeed(0).setFlammability(0);
        return branch;
    }
}
