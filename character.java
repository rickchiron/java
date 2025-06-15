import java.util.*;
public class character 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter character");
        char cha=sc.next().charAt(0);
        if(cha>='A' && cha<='Z' )
        System.out.println("The letter "+cha+" is in uppercase");
        else if(cha>='a' && cha<='z')
        System.out.println("The letter "+cha+ " is in lowercase ");
        else 
        System.out.println(cha+" is not a letter");
    }
}
