package com.group_finity.mascot.dao;

import com.group_finity.mascot.dto.BasicMascot;
import com.group_finity.mascot.dto.MascotConfiguration;
import com.group_finity.mascot.dto.PreviewMascot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

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
        
        try(Stream<Path> pathStream = Files.list(directory)) {
            
            Set<PreviewMascot> mascots = new HashSet<>();
            
            pathStream.forEach((mascotDir) -> {

                String actionFilePath = getClass().getClassLoader().getResource("conf/actions.xml").getFile();
                File actionFile = new File(actionFilePath);
                
                String behaviorFilePath = getClass().getClassLoader().getResource("conf/behaviors.xml").getFile();
                File behaviorFile = new File(behaviorFilePath);
                
                Path imgPath = mascotDir.resolve("shime1.png");

                MascotConfiguration config = new MascotConfiguration();
                config.setActionFile(actionFile);
                config.setBahaviorFile(behaviorFile);

                PreviewMascot mascot = new PreviewMascot();
                mascot.setName(mascotDir.getFileName().toString());
                mascot.setConfig(config);
                mascot.setImage(imgPath.toFile());
                
                mascots.add(mascot);
                
            });
            
            return mascots;
            
        } catch (IOException e) {
            e.printStackTrace();
        }


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
