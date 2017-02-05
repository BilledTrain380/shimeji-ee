package com.group_finity.mascot.dao;

import com.group_finity.mascot.dto.BasicMascot;
import com.group_finity.mascot.dto.PreviewMascot;

import java.nio.file.Path;
import java.util.Set;

/**
 * A provider to get a single mascot or a list of available mascots.
 * 
 * @author nmaerchy
 * @version 0.0.1
 */
public interface MascotProvider {

    /**
     * Searches for available mascots in the given directory.
     * 
     * @param directory Directory for searching.
     * @return All founded mascots.
     */
    Set<PreviewMascot> getAvailableMascots(Path directory);

    /**
     * Get a mascots by location.
     * 
     * @param location The location to get the mascot.
     * @return A DTO class of the founded mascot.
     */
    BasicMascot getMascot(Path location);
    
}
