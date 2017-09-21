import java.util.ArrayList;
import java.util.List;

public class EventLog {

  private List<Event> eventList;

  public EventLog() {
    this.eventList = new ArrayList<>();
  }

  public boolean addEvent(Event event) throws IllegalArgumentException {
    try {
      if (event.getName() == null || event.getAction() == null) {
        throw new IllegalArgumentException();
      } else if (!event.getAction().matches("Face2Face|PhoneCall|TextMessaging|Unknown")) {
        throw new IllegalArgumentException();
      } else {
        System.out.println(event.getName());
        System.out.println(event.getAction());
        return eventList.add(event);
      }
    } catch (IllegalArgumentException illegalArgumentException) {
      illegalArgumentException.printStackTrace();
    }
    return false;
  }

  public int getNumEvents() {
    return eventList.size();
  }
}