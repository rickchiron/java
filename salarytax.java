import java.util.*;
public class salary {
    public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your basic salary: ");
    double bs=sc.nextDouble();
    double da=(31.0/100.0)*bs;
    double hra=(24.0/100.0)*bs;
    double sa= bs<=10000.0 ? (bs*10.0/100.0): 0.0;
    double ts=bs+da+hra+sa;
    System.out.println("Basic salary= "+bs);
    System.out.println("DA="+da);
    System.out.println("HRA="+hra);
    System.out.println("SA= "+sa);
    System.out.println("Total salary= "+ts);
    double tax;
    if(ts>500000.0)
    tax=(30/100.0)*ts;
    else if(ts>300000)
    tax=(20/100.0)*ts;
     
    else if(ts>100000.0)
     tax=(10.0/100.0)*ts;
    else 
     tax=0.0;
    double ns=ts-tax;
    System.out.println("Tax="+tax);
    System.out.println("Net salary="+ns);
}
}
