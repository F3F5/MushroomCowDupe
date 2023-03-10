package fr.bodyalhoha.cowdupe;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class ForgeEventListener
{
  @SubscribeEvent
  public static void onPlayerChat(ClientChatEvent e) {
     Minecraft mc = Minecraft.func_71410_x();
     if (e.getMessage().equals(".cowdupe")) {
       e.setCanceled(true);
       if (mc.field_71439_g.field_71071_by.func_70448_g().func_77973_b().equals(Items.field_151097_aZ)) {
        for (int i = 0; i < 150; i++) {
           if (mc.field_147125_j != null) {
             mc.func_147114_u().func_147297_a((Packet)new CPacketUseEntity(mc.field_147125_j, EnumHand.MAIN_HAND));
          }
        } 
        
         mc.field_71456_v.func_191742_a(ChatType.CHAT, (ITextComponent)new TextComponentString("Finished shearing targeted entity."));
      } else {
        mc.field_71456_v.func_191742_a(ChatType.CHAT, (ITextComponent)new TextComponentString("You need to hold shears to do the glitch."));
      } 
    } 
  }
}
