import java .util.Scanner;
public class Multiplicationtable
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for the multiplication table : ");
        int number=sc.nextInt();

        System.out.println("Multipliaction table for "+number+":");

        for(int i=1;i<=10;i++)
        {
            System.out.println(number+"x"+i+"="+(number*i));
        }
        sc.close();
    }
     
    
}
