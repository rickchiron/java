import java.util.*;
public class bill
 {
 public static void main(String args[])
    {
        int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of days stayed: ");
int d=sc.nextInt();
if(d<=5)
a=1000*d;
else if(d<=10)
a=1000*5+(d-5)*850;
else if(d<=15)
a=1000*5+50*5+(d-10)*650;
else
a=1000*5+850*5+650*5+(d-15)*500;
System.out.println("Your bill = " +a);
sc.close();
    }
    
}
