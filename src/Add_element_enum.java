import java.util.EnumSet;
class Add_element_enum {
    enum Game { CRICKET, HOCKEY, TENNIS }
    public static void main(String[] args)
    {
        EnumSet<Game> games1 = EnumSet.allOf(Game.class);
        EnumSet<Game> games2 = EnumSet.noneOf(Game.class);
        games2.add(Game.HOCKEY);
        System.out.println("EnumSet Using add(): "+ games2);
        games2.addAll(games1);
        System.out.println("EnumSet Using addAll(): "+ games2);
    }
}
