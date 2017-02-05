package com.group_finity.mascot.dao;

import com.group_finity.mascot.dto.BasicMascot;
import com.group_finity.mascot.dto.PreviewMascot;

import java.util.Set;

/**
 * A mascot provider for the file system.
 * 
 * @author nmaerchy
 * @version 0.0.1
 */
public class IOMascotProvider implements MascotProvider {
    /**
     * Searches for available mascots.
     *
     * @return A Set of available mascots.
     */
    @Override
    public Set<PreviewMascot> getAvailableMascots() {
        throw new UnsupportedOperationException("This method is not implemented yet.");
    }

    /**
     * Get a mascots by name.
     *
     * @param name The name of the mascot.
     * @return A DTO class of the founded mascot.
     */
    @Override
    public BasicMascot getBascot(String name) {
        throw new UnsupportedOperationException("This method is not implemented yet.");
    }
}
