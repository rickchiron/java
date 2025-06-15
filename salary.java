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
    System.out.println("Total salary= "+ts);
}
}