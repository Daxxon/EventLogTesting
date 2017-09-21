import java.time.Month;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    List<Action> actions = new ArrayList<>();
    for (int i=0; i< Action.values().length; i++) {
      actions.add(Action.values()[i]);
    }

    Scanner systemInScanner = new Scanner(System.in);
    EventLog testLog = new EventLog();

    System.out.println("Would you like to enter an event? ");
    System.out.print("y or n: ");
    if (systemInScanner.next().equals("y")) {
      Event newEvent = new Event();
      System.out.print("Enter a name for the event: ");
      newEvent.setName(systemInScanner.next());
      System.out.println("Choose and action from the following choices:");
      for (int i=0; i<Action.values().length - 1; i++) {
        System.out.print(Action.values()[i].getEnglishName() + ", ");
      }
      System.out.println("or " + Action.values()[Action.values().length - 1].getEnglishName());
      System.out.print("Your choice: ");
      Action myAction = Action.valueOf(systemInScanner.next().toUpperCase());
      System.out.println("your choice was: " + myAction.getEnglishName());
      newEvent.setAction(myAction.getEnglishName());
    }
  }
}