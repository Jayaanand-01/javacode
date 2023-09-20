
import java.util.*;
class Enum_Eg{
    enum Game { CRICKET, HOCKEY, TENNIS }
    public static void main(String[] args)
    {
        EnumSet<Game> games = EnumSet.allOf(Game.class);
        System.out.println("EnumSet: " + games);
    }
}
