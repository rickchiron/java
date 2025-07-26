 import java.util.*;

public class Maths
{
public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to find its absolute value: ");
    double n=sc.nextDouble();
    double ab=Math.abs(n);
    System.out.println("Absolute value of "+n+" is "+ab);
    System.out.println("Enter a number");
    double x=sc.nextDouble();
    double root=Math.sqrt(x);
    System.out.println("Square root of "+x+" is= "+root);
    System.out.println("Enter a number");
    double y=sc.nextDouble();
    double cbroot=Math.cbrt(y);
    System.out.println("Cube root of "+y+" is= "+cbroot);
    System.out.println("Enter 2 numbers:");
    double a= sc.nextDouble();
    double b= sc.nextDouble();
    double exp=Math.pow(a,b);
    System.out.println(a+"to the power "+b+" is= "+exp);
    
    System.out.println("Enter a number");
    double z=sc.nextDouble();
    double r=Math.round(z);
    System.out.println("Rounded value of "+z+" is= "+r);
    System.out.println("Enter a number");
    double k=sc.nextDouble();
    double f=Math.floor(k);
    System.out.println("Floor value of "+k+" is= "+f);
    System.out.println("Enter a number");
    double l=sc.nextDouble();
    double c=Math.ceil(l);
    System.out.println("Ceil value of "+l+" is= "+c);
    System.out.println("Enter 2 numbers: ");
    double n1=sc.nextDouble();
    double n2=sc.nextDouble(); 
    double mini=Math.min(n1,n2);
    System.out.println("Minimum of "+n1+" and "+n2+" is= "+mini);
    double maxi=Math.max(n1,n2);
    System.out.println("Maximum of "+n1+" and "+n2+" is= "+maxi);
    double ran=(Math.random())*100;
    System.out.println("A random number= "+ran);
    sc.close();

}
} 
    

