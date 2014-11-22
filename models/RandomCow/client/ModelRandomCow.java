package yourModPackage.client.models;

import java.util.HashMap;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import yourModPackage.client.MCAClientLibrary.MCAModelRenderer;
import yourModPackage.common.MCACommonLibrary.MCAVersionChecker;
import yourModPackage.common.MCACommonLibrary.animation.AnimationHandler;
import yourModPackage.common.MCACommonLibrary.math.Matrix4f;
import yourModPackage.common.MCACommonLibrary.math.Quaternion;
import yourModPackage.common.entities.mobs.EntityAcklay;

public class ModelRandomCow extends ModelBase {
public final int MCA_MIN_REQUESTED_VERSION = 1;
public HashMap<String, MCAModelRenderer> parts = new HashMap<String, MCAModelRenderer>();

MCAModelRenderer noName;
MCAModelRenderer noName;
MCAModelRenderer noName;
MCAModelRenderer noName;
public ModelRandomCow()
{
MCAVersionChecker.checkForLibraryVersion(getClass(), MCA_MIN_REQUESTED_VERSION);

textureWidth = 16;
textureHeight = 16;

noName = new MCAModelRenderer(this, "no name", 0, 0);
noName.mirror = false;
noName.addBox(0.0F, 0.0F, 0.0F, 7, 6, 15);
noName.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
noName.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
noName.setTextureSize(16, 16);
parts.put(noName.boxName, noName);

noName = new MCAModelRenderer(this, "no name", 0, 0);
noName.mirror = false;
noName.addBox(0.0F, 0.0F, 0.0F, 2, 7, 3);
noName.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
noName.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-1.0F, 0.0F, 0.0F, -4.371139E-8F)).transpose());
noName.setTextureSize(16, 16);
parts.put(noName.boxName, noName);

noName = new MCAModelRenderer(this, "no name", 0, 0);
noName.mirror = false;
noName.addBox(0.0F, 0.0F, 0.0F, 5, 5, 6);
noName.setInitialRotationPoint(1.0F, 4.0F, 12.0F);
noName.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
noName.setTextureSize(16, 16);
parts.put(noName.boxName, noName);

noName = new MCAModelRenderer(this, "no name", 3, 1);
noName.mirror = false;
noName.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2);
noName.setInitialRotationPoint(5.0F, 0.0F, 0.0F);
noName.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-1.0F, 0.0F, 0.0F, -4.371139E-8F)).transpose());
noName.setTextureSize(16, 16);
parts.put(noName.boxName, noName);
noName.addChild(noName);

}

@Override
public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) 
{
EntityRandomCow entity = (EntityRandomCow)par1Entity;

//Render every non-child part
noName.render(par7);
noName.render(par7);
noName.render(par7);

AnimationHandler.performAnimationInModel(parts, entity);
}
@Override
public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {}

public MCAModelRenderer getModelRendererFromName(String name)
{
return parts.get(name) != null ? parts.get(name) : null;
}
}