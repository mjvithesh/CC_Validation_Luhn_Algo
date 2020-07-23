//Credit card validation using Luhn Algorithm
package luhn_algorithm;
import java.util.Scanner;

public class Luhn_Algorithm {
    @SuppressWarnings("empty-statement")
    
    public static void main(String[] args) {
        try
        {   Exception e = null;
            Scanner scan = new Scanner(System.in);
            //Instructions to user
            System.out.println("This Program helps to validate Credit Card Numbers.");
            System.out.println("PS : Length of Credit Card Number is 13 to 19.");
            System.out.print("Enter Credit Card Number:");
            //input from user
            String cardNo = scan.next();
            //validation 1
            if(cardNo.length()<13||cardNo.length()>19)throw e; // no of digits in credit card shloud be >13 and <19
            //validation 2
            boolean isSecond=false;
            int sum=0;
            for(int i=cardNo.length()-1;i>=0;i--)
                {
                   int a = cardNo.charAt(i)-48;
                   if(isSecond==true)
                       a*=2;  // doubling every second digit from right
                   sum+=a/10;   //If doubled digit >9 add them
                   sum+=a%10;
                   isSecond=!isSecond;
                }
            if(sum%10==0)
                System.out.println("valid Credit card!");
            else throw e;
        }
        catch (Exception e){
            System.out.println("Not a Valid Credit Card!");
        };
    }
}
