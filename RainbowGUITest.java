import static org.junit.Assert.*;



import org.junit.Test;

import org.fest.swing.core.EmergencyAbortListener;
import org.fest.swing.finder.WindowFinder;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.launcher.ApplicationLauncher;
import org.fest.swing.testing.FestSwingTestCaseTemplate;
import org.fest.swing.timing.Condition;
import org.fest.swing.timing.Pause;
import org.fest.swing.timing.Timeout;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class RainbowGUITest extends FestSwingTestCaseTemplate{

    private static EmergencyAbortListener mEmergencyAbortListener;
    private FrameFixture mFrame;    

    public RainbowGUITest(){
    }

    @BeforeClass
    public static void setUpClass() throws Exception{
        mEmergencyAbortListener = EmergencyAbortListener.registerInToolkit();
    }

    @AfterClass
    public static void tearDownClass() throws Exception{
        mEmergencyAbortListener.unregister();
    }

    @Before
    public void setUp(){
        setUpRobot();
       
        ApplicationLauncher.application( RainbowGUI.class ).start();
        mFrame = WindowFinder.findFrame( "frame" ).using( robot() ); 

    }

    @After
    public void tearDown(){
        cleanUp();
    }
    
    @Test
    public void testRed(){        
        mFrame.textBox("input").enterText("Red");
        mFrame.button("btnCheck").click();
        mFrame.button("btnCheck").click();
        
        mFrame.textBox("output").requireText("Red is a color of the Rainbow");   
    }
    
    @Test
    public void testOrange(){        
        mFrame.textBox("input").enterText("Orange");
        mFrame.button("btnCheck").click();
              
        mFrame.textBox("output").requireText("Orange is a color of the Rainbow");   
    }
    
    @Test
    public void testYellow(){
    	mFrame.textBox("input").enterText("Yellow");
        mFrame.button("btnCheck").click();
        
        mFrame.textBox("output").requireText("Yellow is a color of the Rainbow");   
    }
    
    @Test
    public void testGreen(){
    	mFrame.textBox("input").enterText("Green");
        mFrame.button("btnCheck").click();
       
        
        mFrame.textBox("output").requireText("Green is a color of the Rainbow");   
    }
    

    @Test
    public void testBlue(){        
        mFrame.textBox("input").enterText("Blue");
        mFrame.button("btnCheck").click();
        
        mFrame.textBox("output").requireText("Blue is a color of the Rainbow");   
    }
    
    @Test
    public void testIndigo(){
    	mFrame.textBox("input").enterText("Indigo");
        mFrame.button("btnCheck").click();
          
        mFrame.textBox("output").requireText("Indigo is a color of the Rainbow");   
    }
    
    @Test
    public void testViolet(){
    	mFrame.textBox("input").enterText("Violet");
        mFrame.button("btnCheck").click();
       
        mFrame.textBox("output").requireText("Violet is a color of the Rainbow");   
    }
    
    @Test
    public void testWrongInput(){
    	mFrame.textBox("input").enterText("Black");
    	mFrame.button("btnCheck").click();
    	
    	mFrame.textBox("output").requireText("Black is not a color of the Rainbow");   
    }
    
    
   
    
    
}