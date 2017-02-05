package com.group_finity.mascot.business;

import com.group_finity.mascot.Manager;
import com.group_finity.mascot.config.ConfigurationBuilder;
import com.group_finity.mascot.dao.IOMascotProvider;
import com.group_finity.mascot.dao.MascotProvider;
import com.group_finity.mascot.dto.PreviewMascot;

import java.util.Set;

/**
 * Default implementation of a MascotLoader.
 * 
 * @author nmaerchy
 * @version 0.0.1
 */
public class DefaultMascotLoader implements MascotLoader {
    
    private final MascotProvider mascotProvider;
    private final ConfigurationBuilder configBuilder;
    private final Manager manager;

    public DefaultMascotLoader() {
        this(
                new IOMascotProvider(),
                new ConfigurationBuilder(),
                new Manager()
        );
    }

    public DefaultMascotLoader(MascotProvider mascotProvider, ConfigurationBuilder configBuilder, Manager manager) {
        this.mascotProvider = mascotProvider;
        this.configBuilder = configBuilder;
        this.manager = manager;
    }

    /**
     * Discovers available mascots.
     *
     * @return A Set of available mascots.
     */
    @Override
    public Set<PreviewMascot> discover() {
        throw new UnsupportedOperationException("This method is not implemented yet.");
    }

    /**
     * Loads a specific mascot by name.
     *
     * @param name The name of the mascot to load.
     */
    @Override
    public void load(String name) {
        throw new UnsupportedOperationException("This method is not implemented yet.");
    }
}
