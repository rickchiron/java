import java.util.*;
public class area
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice s for square, r for rectangle, t for triangle, c for circle");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 's':case 'S': System.out.println("Enter side of square: ");int s=sc.nextInt();
            double sa=s*s; System.out.println("Area= "+sa);break;
            case 'r': case'R': System.out.println("Enter length and breadth of rectangle: ");int l=sc.nextInt();int b=sc.nextInt();
            double ra  = l*b; System.out.println("Area= "+ra);break;
            case 't':case 'T':System.out.println("Enter height and breadth of triangle: "); int h=sc.nextInt(); int k= sc.nextInt();
            double ta=(1.0/2.0)*k*h; System.out.println("Area= "+ta);break;
            case 'c':case'C':  System.out.println("Enter radius of circle: ");int r=sc.nextInt();
            double ca=(22.0/7.0)*r*r; System.out.println("Area= "+ca);break;
            default: System.out.println("Wrong input.");
        }
     }
}