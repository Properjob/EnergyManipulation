package com.properjob.energymanipulation;

import com.properjob.energymanipulation.proxy.CommonProxy;
import com.properjob.energymanipulation.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Danny's on 23/05/2015.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class EnergyManipulation {

    @Mod.Instance(Reference.MOD_ID)
    public static EnergyManipulation instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        /*ModBlocks.init();
        ModItems.init();
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        proxy.registerTileEntities();
        proxy.registerRendering();*/
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        /*Recipes.init();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GUIHandler());
        GameRegistry.registerWorldGenerator(new WorldHandler(), 0);*/
    }
}
