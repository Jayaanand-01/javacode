public class New_excep {
    static void meth1() throws Exception
    {
        try
        {
            System.out.println("Goooooooood");
            throw new Exception();

        }
        catch(Exception e)
        {
            System.out.printf("Good\n");
        }
        finally
        {
            System.out.println("Final message");
        }
    }

    public static void main(String[] args) throws Exception {
        meth1();
    }
}
