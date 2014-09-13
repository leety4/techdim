package com.leety4.techdim;

import com.leety4.techdim.proxy.iProxy;
import com.leety4.techdim.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class techdim {
	
	@Mod.Instance(Reference.MOD_ID)
	public static techdim instance;
	
	@SidedProxy(clientSide="com.leety4.techdim.proxy.ClientProxy",serverSide="com.leety4.techdim.proxy.ServerProxy")
	public static iProxy proxy;
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event){
		
	}
}
