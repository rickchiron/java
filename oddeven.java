import java.util.*;
public class oddeven
 {
    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter number: ");
      int n=sc.nextInt();
      if(n%2==0)
      System.out.println("Even number.");
      else
      System.out.println("Odd number.");
sc.close();
    }
}
