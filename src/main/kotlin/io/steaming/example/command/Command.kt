package io.steaming.example.command

import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class Command : CommandExecutor {
    //command function page
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        if (sender is Player){
            val p : Player = sender
            p.sendMessage("아이템을 지급했어요")

            val item = ItemStack(Material.GOLDEN_APPLE)
            item.amount = 64

            p.inventory.addItem(item)
            return true
        }else{
            sender.sendMessage("플레이어가 아닌 대상에겐 지급할수 없어요!")
            return false
        }
    }
}