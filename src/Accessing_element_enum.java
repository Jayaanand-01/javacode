import java.util.EnumSet;
import java.util.Iterator;
class Accessing_element_enum {
    enum Game { CRICKET, HOCKEY, TENNIS }
    public static void main(String[] args)
    {
        EnumSet<Game> games = EnumSet.allOf(Game.class);
        Iterator<Game> iterate = games.iterator();
       System.out.print("EnumSet: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
