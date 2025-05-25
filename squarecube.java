import java.util.*;
public class squarecube
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        double n=sc.nextDouble();
        double sq,cb;
        sq=n*n;
        cb=n*n*n;
        System.out.println("Square of number= "+sq);
        System.out.println("Cube of number= "+cb);
        sc.close();
    }
}
