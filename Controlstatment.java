import java.util.Scanner;
public class Controlstatment
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.err.println("Enter a number : ");
        int a=sc.nextInt();
        int count=0;

        if(a%2==0 )
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("number is even");


        }
        if(a<=1)
        {
            System.out.println("is not a prime number");
        }
        else
        {
            for (int i = 2; i <= a / 2; i++)
             {
                if (a % i == 0) {
                    count++;
                    break; 
                }
        }
        if (count == 0) {
                System.out.println(a + " is a Prime number.");
            } else {
                System.out.println(a + " is Not a Prime number.");
            }
        }

        switch (a) {
            case 1:System.out.println("Monday");
                break;
            case 2:System.out.println("tuesday");
                break;  
            case 3:System.out.println("Wednesday");
                break;  
            case 4:System.out.println("Thrusday");
                break;    
            case 5:System.out.println("friday");
                break;
            case 6:System.out.println("Saturday");
                break;
            case 7:System.out.println("Sunday");
                break;                    
        
            default:System.out.println("Invalid");
                break;
                
        }
        sc.close();

    }
        
}
