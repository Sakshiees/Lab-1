import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] number=new int[10];
        int sum=0;
        int min,max;

        System.out.println("Enter 10 integers");

        for(int i=0;i<=10;i++)
        {
            number[i]=sc.nextInt();
            sum+=number[i];

        }
        max=number[0];
        min=number[0];

        for(int i=0;i<=10;i++)
        {
            if(number[i]>max)
            {
                max=number[i];
            }
            if(number[i]>min)
            {
                min=number[i];
            }
        }
        double average=(double)sum/10;

        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

    }
}