import java.util.Scanner;
public class factorial
{
    public static void  main(){
        int i,n;
        int factorial=1;
        Scanner chiron=new Scanner(System.in);
        System.out.println("Enter number: ");
        n=chiron.nextInt();
        for(i=1;i<=n;i++)
        {
            factorial=factorial*i;
            
        }
        System.out.println("Factorial of "+n+"="+factorial);
    }
}
