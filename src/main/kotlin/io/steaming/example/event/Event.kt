package io.steaming.example.event

import net.kyori.adventure.audience.Audience
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent

class Event : Listener {
    //event page
    @EventHandler
    fun dmg(event : EntityDamageEvent) {
        if (event.entity is Player){
            val p : Player = event.entity as Player
            val range = (event.damage.toInt()..event.damage.toInt()+20).random().toDouble()

            event.damage = range

            val aud : Audience = p
            aud.sendActionBar(Component.text("[ 받은 데미지 :")
                .append(Component.text(range, TextColor.color(0xFF0000), TextDecoration.BOLD))
                .append(Component.text(" ]")))
        }
    }
}