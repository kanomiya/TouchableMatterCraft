package com.kanomiya.mcmod.movablemattercraft.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Date: 2016/04/01 20:09:31
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


public class ModelBox extends ModelBase
{
	//fields
	ModelRenderer box;

	public ModelBox()
	{
		textureWidth = 64;
		textureHeight = 32;

		box = new ModelRenderer(this, 0, 0);
		box.addBox(0F, 0F, 0F, 16, 16, 16);
		box.setRotationPoint(0F, 0F, 0F);
		box.setTextureSize(64, 32);
	}

	@Override
	public void render(Entity entityIn, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float scale)
	{
		setRotationAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, scale, entityIn);
		doRender(scale);
	}

	public void doRender(float f)
	{
		box.render(f);
	}


}