import java.util.Scanner;
public class calc
{
    public static void main()
    {
        int a,b, func;
        Scanner eaten=new Scanner(System.in);
        System.out.println("Enter 1st no.");
        a=eaten.nextInt();
        System.out.println("Enter 2nd no.");
        b=eaten.nextInt();
        System.out.println("Enter function(1,2,3,4): ");
        func=eaten.nextInt();
        double sum=a+b;
        double dif=a-b;
        double pro=a*b;
        double div=a/b;
        double mod=a%b;
        switch(func){
            case 1 :System.out.println("Sum="+sum);break;
            case 2 :System.out.println("Difference="+dif);break;
            case 3 :System.out.println("Product="+pro);break;
            case 4 :System.out.println("Division="+div);break;
            case 5 :System.out.println("Modulo="+mod);break;
            default:System.out.println("Invalid Function");
        }
        
    }
}
