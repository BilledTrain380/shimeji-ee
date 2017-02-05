package com.group_finity.mascot.dao;

import com.group_finity.mascot.dto.BasicMascot;
import com.group_finity.mascot.dto.PreviewMascot;

import java.util.Set;

/**
 * A provider to get a single mascot or a list of available mascots.
 * 
 * @author nmaerchy
 * @version 0.0.1
 */
public interface MascotProvider {

    /**
     * Searches for available mascots.
     * 
     * @return A Set of available mascots.
     */
    Set<PreviewMascot> getAvailableMascots();

    /**
     * Get a mascots by name.
     * 
     * @param name The name of the mascot.
     * @return A DTO class of the founded mascot.
     */
    BasicMascot getBascot(String name);
    
}
