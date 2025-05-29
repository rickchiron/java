import java.util.*;
public class tax
{
    public static void main(String args[])
    {
        Scanner gt=new Scanner(System.in);
        double s, t, ns;
        System.out.println("Enter salary: ");
        s=gt.nextDouble();
        if(s<=250000.0)
        t=0;
        else if(s<=500000.0)
        t=(5.0/100.0)*s;
        else if(s<=750000.0)
        t=(5.0/100.0)*500000.0 + (10.0/100.0)*(s-500000.0);
        else if(s<=1000000.0)
        t=(5.0/100.0)*500000 + (10.0/100.0)*750000 + (15.0/100.0)*(s-750000.0);
        else 
        t=(5.0/100.0)*500000.0 + (10.0/100.0)*750000.0 + (15.0/100.0)*1000000.0 + (20.0/100.0)*(s-1000000.0);
        ns=s-t;
        System.out.println("Basic salary="+s);
        System.out.println("Tax= "+t);
        System.out.println("Net salary= "+ns);
    }
}
