package com.group_finity.mascot.dao;

import com.group_finity.mascot.dto.BasicMascot;
import com.group_finity.mascot.dto.PreviewMascot;

import java.nio.file.Path;
import java.util.Set;

/**
 * A mascot provider for the file system.
 * 
 * @author nmaerchy
 * @version 0.0.1
 */
public class IOMascotProvider implements MascotProvider {

    /**
     * Searches for available mascots in the given directory.
     *
     * @param directory Directory for searching.
     * @return All founded mascots.
     */
    @Override
    public Set<PreviewMascot> getAvailableMascots(Path directory) {
        throw new UnsupportedOperationException("This method is not implemented yet.");
    }

    /**
     * Get a mascots by location.
     *
     * @param location The location to get the mascot.
     * @return A DTO class of the founded mascot.
     */
    @Override
    public BasicMascot getMascot(Path location) {
        throw new UnsupportedOperationException("This method is not implemented yet.");
    }
}
