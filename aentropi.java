import java.util.*;
import java.lang.*;

class aentropi{
    public static void main (String []args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        float p[]=new float[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter element no. n[" + (i+1) + "]");
            p[i]=sc.nextFloat();
        }
        float sum=0;
        for(int i=0;i<n;i++)
        {
            sum = (p[i] *(float)Math.log(p[i]) ) + sum;
        }
        float h = -sum/(float)Math.log(2);
        System.out.println("the entropy is");
        System.out.println(h);
    }
}