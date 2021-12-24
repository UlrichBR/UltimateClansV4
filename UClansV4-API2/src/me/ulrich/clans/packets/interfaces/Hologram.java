package me.ulrich.clans.packets.interfaces;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.HologramObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles NMS specific code for rendering "Holograms"
 */
public interface Hologram {

    HologramObject addHologram(HologramObject hologram);

    HologramObject removeHologram(HologramObject hologram);

    void removeHologram(HologramObject hologramObject, Location location, int lines);

    void removeHologram(Location location, int lines);

    void updateVisible(HologramObject hologramObject, Location location, Player player, boolean visible);

    HologramObject getHologram(Location location);

    HologramObject getHologram(String name);

    List<HologramObject> getHolograms();

    /**
     * Spawns multiple holograms at the specified location.
     *
     * @param location  The location to spawn the holograms at.
     * @param holograms A list of Strings for the holograms.
     */
    @Deprecated
    void spawnHolograms(Location location, List<String> holograms);

    /**
     * Spawns a hologram at the specified location.
     *
     * @param location The location to spawn the hologram at.
     * @param line     The text the hologram is to display.
     */
    @Deprecated
    void spawnHologram(Location location, String line);

    /**
     * Removes/Despawns any holograms at the specified location.
     *
     * @param location The location to despawn holograms from.
     */
    @Deprecated
    void despawnHologram(Location location);

    /**
     * Adds the specified location to the hologram list.
     *
     * @param location The location to add.
     */
    @Deprecated
    void addHologram(Location location);

    /**
     * Gets a list of locations where holograms are present.
     *
     * @return A list of locations where holograms are present.
     */
    @Deprecated
    ArrayList<Location> getLocations();

}

