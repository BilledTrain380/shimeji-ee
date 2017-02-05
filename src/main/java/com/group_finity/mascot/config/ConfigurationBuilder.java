package com.group_finity.mascot.config;

import com.group_finity.mascot.dto.BasicMascot;

import javax.xml.parsers.DocumentBuilderFactory;

/**
 * A builder for a mascot configuration.
 * 
 * @see Configuration
 * 
 * @author nmaerchy
 * @version 0.0.1
 */
public class ConfigurationBuilder {
    
    private final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    /**
     * Builds a Configuration for the given mascot.
     * 
     * @param mascot The mascot to build the configuration for.
     * @return The created config for the mascot.
     */
    public Configuration build(BasicMascot mascot) {
        throw new UnsupportedOperationException("This method is not implemented yet.");
    }
}
