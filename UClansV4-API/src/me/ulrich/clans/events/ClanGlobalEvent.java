package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.ClanEvents;

/*
ClanGlobalEvent event = new ClanGlobalEvent(ClanData, sender, ClanEvents, sync, null);
Bukkit.getPluginManager().callEvent(event);
*/

public class ClanGlobalEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private ClanData clan;
	private ClanEvents event;
	private boolean syncronizable;
	private UUID sender;
	private String extraVar2;
	private String message;
    
    public ClanGlobalEvent(ClanData clan,UUID sender, ClanEvents event, boolean syncronizable, String extraVar2, String message) {
    	this.setClan(clan);
    	this.setSender(sender);
    	this.setEvent(event);
    	this.setSyncronizable(syncronizable);
    	this.setExtraVar2(extraVar2);
    	this.setMessage(message);
 
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

	public ClanEvents getEvent() {
		return event;
	}

	public void setEvent(ClanEvents event) {
		this.event = event;
	}

	public boolean isSyncronizable() {
		return syncronizable;
	}

	public void setSyncronizable(boolean syncronizable) {
		this.syncronizable = syncronizable;
	}

	public ClanData getClan() {
		return clan;
	}


	public void setClan(ClanData clan) {
		this.clan = clan;
	}

	public UUID getSender() {
		return sender;
	}

	public void setSender(UUID sender) {
		this.sender = sender;
	}

	public String getExtraVar2() {
		return extraVar2;
	}

	public void setExtraVar2(String extraVar2) {
		this.extraVar2 = extraVar2;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
