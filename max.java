import java.util.Scanner;
public class max
{
    public static void main()
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no. :");
        a=sc.nextInt();
        System.out.println("Enter 2nd no. :");
        b=sc.nextInt();
        if(a>b)
        System.out.println(a+" is greater than "+b);
        else
        System.out.println(b+" is greater than "+a);
    }
}
