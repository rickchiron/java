import java.util.Scanner;
public class evennumber {
    public static void main(String[] args) {
        Scanner gtr = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=gtr.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            if (i%2==0)
            {
                System.out.print(i+",");
            }
        }
        gtr.close();
    }
}