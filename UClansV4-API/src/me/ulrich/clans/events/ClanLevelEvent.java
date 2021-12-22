package me.ulrich.clans.events;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.ulrich.clans.data.ClanData;

public class ClanLevelEvent extends Event implements Cancellable {

	 private static final HandlerList handlers = new HandlerList();
	 private boolean cancelled;
	private ClanData clan;
	private CommandSender sender;
	    
	public ClanLevelEvent(ClanData clan, CommandSender sender2) {
		this.setClan(clan);
		this.setSender(sender2);
	}
	
	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

	public ClanData getClan() {
		return clan;
	}

	public void setClan(ClanData clan) {
		this.clan = clan;
	}

	public CommandSender getSender() {
		return sender;
	}

	public void setSender(CommandSender sender2) {
		this.sender = sender2;
	}
}
