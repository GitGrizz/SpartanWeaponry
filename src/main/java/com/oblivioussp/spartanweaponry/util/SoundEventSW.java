package com.oblivioussp.spartanweaponry.util;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundEventSW extends SoundEvent 
{
	public SoundEventSW(ResourceLocation soundNameIn)
	{
		super(soundNameIn);
		this.setRegistryName(soundNameIn);
	}

}
