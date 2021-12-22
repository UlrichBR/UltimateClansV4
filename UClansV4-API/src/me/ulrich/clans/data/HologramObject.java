package me.ulrich.clans.data;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

public class HologramObject {

    private String name;

    private Entity entity = null;

    private Location location;

    private ArrayList<String> lines;

    private ArrayList<UUID> invisible = new ArrayList<>();

    public HologramObject(String name, Location location, ArrayList<String> lines) {
        this.name = name;
        this.location = location;
        this.lines = lines;
    }

    public HologramObject(String name, Location location, String string) {
        this(name, location, new ArrayList<>(Collections.singletonList(string)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location.clone();
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public World getWorld() {
        return location.getWorld();
    }

    public double getX() {
        return location.getX();
    }

    public double getY() {
        return location.getY();
    }

    public double getZ() {
        return location.getZ();
    }

    public ArrayList<String> getLines() {
        return new ArrayList<>(lines);
    }

    public int getLineCount() {
        return lines.size();
    }

    public void addLine(String string) {
        lines.add(string);
    }

    public void removeLine(int line) {
        lines.remove(line);
    }

    public void removeLine(String string) {
        lines.remove(string);
    }

    public Entity getEntity() {
        if (entity == null) {
            Collection<Entity> nearbyEntite = location.getWorld().getNearbyEntities(location, 2, 2, 2);
            for (org.bukkit.entity.Entity entity : nearbyEntite) {
                if (entity.getType() == EntityType.ARMOR_STAND) {
                    if (location.getX() == entity.getLocation().getX() && location.getY() == entity.getLocation().getY() && location.getZ() == entity.getLocation().getZ()) {
                       
                    	
                    	this.entity = entity;
                    }
                }
            }
        }
        return entity;
    }

    public void setVisible(Player player, boolean isVisible) {
        if (!isVisible) {
            this.invisible.add(player.getUniqueId());
        } else {
            this.invisible.remove(player.getUniqueId());
        }
    }

    public boolean isVisible(Player player) {
        return !invisible.contains(player.getUniqueId());
    }

    @Override
    public String toString() {
        return "Hologram:{"
                + "Name:\"" + name + "\","
                + "Location:{"
                + "World:\"" + location.getWorld().getName() + "\","
                + "X:" + location.getBlockX() + ","
                + "Y:" + location.getBlockY() + ","
                + "Z:" + location.getBlockZ()
                + "},"
                + "Lines:" + lines.size() + ",";
    }
}

