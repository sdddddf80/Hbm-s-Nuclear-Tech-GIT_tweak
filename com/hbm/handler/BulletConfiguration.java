package com.hbm.handler;

import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class BulletConfiguration {
	
	//what item this specific configuration consumes
	public Item ammo;
	//how fast the bullet is (in sanics per second, or sps)
	public float velocity;
	//spread of bullets in gaussian range
	public float spread;
	//weapon durability reduced (centered around 10)
	public float tear;
	
	//damage bounds
	public float dmgMin;
	public float dmgMax;
	
	//acceleration torwards neg Y
	public double gravity;
	//max age in ticks before despawning
	public int maxAge;

	//whether the projectile should be able to bounce off of blocks
	public boolean doesRicochet;
	//the maximum angle at which the projectile should bounce
	public double ricochetAngle;
	//lower bound ricochet chance (below R angle)
	public int LBRC;
	//higher bound ricochet chance (above R angle)
	public int HBRC;
	//how much of the initial velocity is kept after bouncing
	public double bounceMod;

	//whether or not the bullet should penetrate mobs
	public boolean doesPenetrate;
	//whether or not the bullet should phase through blocks
	public boolean isSpectral;
	//whether or not the bullet should break glass
	public boolean doesBreakGlass;
	
	//bullet effects
	public List<PotionEffect> effects;
	public int incendiary;
	public int emp;
	public float explosive;
	public int rainbow;
	public int nuke;
	public boolean boxcar;
	public boolean boat;
	public boolean destroysBlocks;
	public boolean instakill;
	
	//appearance
	public int style;
	//additional appearance data, i.e. particle effects
	public int trail;
	//ricochet sound type
	public int plink;

	public static final int STYLE_NORMAL = 0;
	public static final int STYLE_FLECHETTE = 1;
	public static final int STYLE_PELLET = 2;
	public static final int STYLE_BOLT = 3;
	public static final int STYLE_FOLLY = 4;
	public static final int STYLE_ROCKET = 5;
	public static final int STYLE_STINGER = 6;
	public static final int STYLE_NUKE = 7;
	public static final int STYLE_MIRV = 8;
	public static final int STYLE_GRENADE = 9;

	public static final int PLINK_NONE = 0;
	public static final int PLINK_BULLET = 1;
	public static final int PLINK_GRENADE = 2;
	public static final int PLINK_ENERGY = 3;
	public static final int PLINK_SING = 4;

}
