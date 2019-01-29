import java.util.*;

//import javax.lang.model.util.ElementScanner6;

//import java.lang.*;
class prifix
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the strings number");
        int n = Sc.nextInt();
        int length;
        String st[] = new String [n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the string of ");
            st[i] = Sc.next();
            System.out.println("debug");
        }
        
        for(int j = 1;j<n;j++)
        {
            length = st[j].length();
            if (st[j].startsWith(st[j-1]))
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
        Sc.close();
    }
}