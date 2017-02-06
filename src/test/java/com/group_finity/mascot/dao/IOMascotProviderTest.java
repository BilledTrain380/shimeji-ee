package com.group_finity.mascot.dao;

import com.group_finity.mascot.dto.MascotConfiguration;
import com.group_finity.mascot.dto.PreviewMascot;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import javax.imageio.ImageIO;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * @author nmaerchy
 * @version 0.0.1
 */
public class IOMascotProviderTest {
    
    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();
    
    private IOMascotProvider provider;
    
    @Before
    public void setUp() throws Exception {
        provider = new IOMascotProvider();
    }

    @Test
    public void getAvailableMascots() throws Exception {
        
        PreviewMascot previewShimeji = new PreviewMascot();
        previewShimeji.setName("Shimeji");
        previewShimeji.setImage(ImageIO.read(getClass().getClassLoader().getResourceAsStream("Shimeji/shime1.png")));

        MascotConfiguration config = new MascotConfiguration();
        config.setActionFile(new File(getClass().getClassLoader().getResource("conf/actions.xml").getFile()));
        config.setBahaviorFile(new File(getClass().getClassLoader().getResource("conf/behaviors.xml").getFile()));
        previewShimeji.setConfig(config);
        
        
        PreviewMascot previewKuroShimeji = new PreviewMascot();
        previewKuroShimeji.setName("KuroShimeji");
        previewKuroShimeji.setImage(ImageIO.read(getClass().getClassLoader().getResourceAsStream("KuroShimeji/shime1.png")));
        previewKuroShimeji.setConfig(config);
        
        Set<PreviewMascot> expeted = new HashSet<>();
        expeted.add(previewShimeji);
        expeted.add(previewKuroShimeji);
        
        File searchFile = new File(getClass().getClassLoader().getResource("./").getFile());
        
        Set<PreviewMascot> mascots = provider.getAvailableMascots(searchFile.toPath());
        
        assertEquals(expeted, mascots);
    }

    @Test
    public void getMascot() throws Exception {

    }

}