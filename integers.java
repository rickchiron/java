import java.util.*;
public class integers
{
    public static void main()
    {
        double m,n,q;
        Scanner gtr=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        n=gtr.nextDouble();
        System.out.println("Enter a number m: ");
        m=gtr.nextDouble();
        System.out.println("Enter a number q: ");
        q=gtr.nextDouble();
        double mn=Math.pow(m,n);
        double max=Math.max(m,Math.max(n,q));
        double min=Math.min(m,Math.min(n,q));
        double cube1=Math.cbrt(max);
        double cube2=Math.cbrt(min);
        System.out.println("m to the power n= "+mn);
        System.out.println("Maximum no. of all= "+max);
        System.out.println("Minimum no. of all= "+min);
        System.out.println("Cube root of maximum number= "+cube1);
        System.out.println("Cube root of minimum number= "+cube2);
    }
}
