package com.group_finity.mascot.dao;

import com.group_finity.mascot.dto.MascotConfiguration;
import com.group_finity.mascot.dto.PreviewMascot;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * @author nmaerchy
 * @version 0.0.1
 */
public class IOMascotProviderTest {
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    private IOMascotProvider provider;
    
    @Before
    public void setUp() throws Exception {
        provider = new IOMascotProvider();
    }

    @Test
    public void getAvailableMascots() throws Exception {
        
        PreviewMascot previewShimeji = new PreviewMascot();
        previewShimeji.setName("Shimeji");
        File shimejiImg = new File(getClass().getClassLoader().getResource("shimeji/Shimeji/shime1.png").getFile());
        previewShimeji.setImage(shimejiImg);

        MascotConfiguration config = new MascotConfiguration();
        config.setActionFile(new File(getClass().getClassLoader().getResource("conf/actions.xml").getFile()));
        config.setBahaviorFile(new File(getClass().getClassLoader().getResource("conf/behaviors.xml").getFile()));
        previewShimeji.setConfig(config);
        
        
        PreviewMascot previewKuroShimeji = new PreviewMascot();
        previewKuroShimeji.setName("KuroShimeji");
        File kuroShimejiImg = new File(getClass().getClassLoader().getResource("shimeji/KuroShimeji/shime1.png").getFile());
        previewKuroShimeji.setImage(kuroShimejiImg);
        previewKuroShimeji.setConfig(config);
        
        Set<PreviewMascot> expected = new HashSet<>();
        expected.add(previewShimeji);
        expected.add(previewKuroShimeji);
        
        File searchFile = new File(getClass().getClassLoader().getResource("shimeji/").getFile());
        
        Set<PreviewMascot> mascots = provider.getAvailableMascots(searchFile.toPath());
        
        assertEquals(expected, mascots);
    }
    
    @Test
    public void getAvailableMascotsWhenIOException() throws Exception {
        
        thrown.expect(IOException.class);
        
        provider.getAvailableMascots(Paths.get("does not exists"));
    }

    @Test
    public void getMascot() throws Exception {

    }

}