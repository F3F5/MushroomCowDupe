package fr.bodyalhoha.cowdupe;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = "cowdupe", name = "Cow Dupe", version = "1.0")
public class DupeMod
{
  public static final String MODID = "cowdupe";
  public static final String NAME = "Cow Dupe";
  public static final String VERSION = "1.0";
  private static Logger logger;
  
  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
     logger = event.getModLog();
  }

  @EventHandler
  public void init(FMLInitializationEvent e) {
     MinecraftForge.EVENT_BUS.register(ForgeEventListener.class);
  }
}

