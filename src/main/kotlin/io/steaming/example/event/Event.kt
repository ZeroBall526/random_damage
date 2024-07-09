package io.steaming.example.event

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class Event : Listener {
    //event page

    @EventHandler
    fun join(e : PlayerJoinEvent){
        val p : Player = e.player

        e.joinMessage = "${p.name}님이 접속하셨습니다."
        p.sendMessage("${p.name}님 환영합니다!")
    }
}