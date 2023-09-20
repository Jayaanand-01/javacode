import com.sun.deploy.security.SelectableSecurityManager;

public class Leap_year {
    public static void isLeapyear(int year) {
        boolean isLeapyear = false;
        if (year % 4 == 0)
        {
            isLeapyear = true;
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    isLeapyear = true;
                }
                else
                {
                    isLeapyear = false;
                }
            }
        }
        else
            isLeapyear=false;
        if(!isLeapyear)
            System.out.println(year+":Non leap-year");
        else
            System.out.println(year+":Leap year");
}
    public static void main(String[] args) {
        isLeapyear(2000);
        isLeapyear(2002);
    }
}
