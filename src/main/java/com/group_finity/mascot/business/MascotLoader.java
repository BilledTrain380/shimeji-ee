package com.group_finity.mascot.business;

import com.group_finity.mascot.dto.PreviewMascot;

import java.util.Set;

/**
 * Loader for mascots, provides a discover method to get available mascots
 * and a load method to load a specific mascot.
 * 
 * @author nmaerchy
 * @version 0.0.1
 */
public interface MascotLoader {

    /**
     * Discovers available mascots.
     * 
     * @return A Set of available mascots.
     */
    Set<PreviewMascot> discover();

    /**
     * Loads a specific mascot by name.
     * 
     * @param name The name of the mascot to load.
     */
    void load(String name);
    
}
