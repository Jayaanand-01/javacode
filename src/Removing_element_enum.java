import java.util.EnumSet;
class Removing_element_enum {
    enum Game { CRICKET, HOCKEY, TENNIS }
    public static void main(String[] args)
    {
        EnumSet<Game> games = EnumSet.allOf(Game.class);
        System.out.println("EnumSet: " + games);
        boolean value1 = games.remove(Game.CRICKET);
        System.out.println("Is CRICKET removed? " + value1);
        boolean value2 = games.removeAll(games);
        System.out.println("Are all elements removed? " + value2);
    }
}
