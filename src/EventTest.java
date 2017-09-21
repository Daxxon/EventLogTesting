import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.After;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class EventTest {


  private EventLog testLog;

  @Before
  public void setUp() throws Exception {
    System.out.println("PREPARING");
    testLog = new EventLog();
  }

  @After
  public void tearDown() throws Exception {
    System.out.println("CLEANING UP");
  }

  @Test
  public void addEventTest_returnsTrueWhenEventAdded() {
    Event dogJumped = new Event();
    dogJumped.setName("Skipper Jumped");
    dogJumped.setAction("PhoneCall");
    assertTrue(testLog.addEvent(dogJumped));
  }
}
