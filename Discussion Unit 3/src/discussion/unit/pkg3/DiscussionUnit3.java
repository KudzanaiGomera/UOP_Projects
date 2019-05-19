
package discussion.unit.pkg3;
import java.util.Scanner;

public class DiscussionUnit3 {

    
    public static void main(String[] args) {
        int a,b,c,answer;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a....");
        a = scan.nextInt();
        System.out.println("Enter the value of b....");
        b = scan.nextInt();
        System.out.println("Enter the value of c....");
        c = scan.nextInt();
        
        try{
            answer = (a + b)/c;
            System.out.println("the result is..."+answer);
        }catch(ArithmeticException e){
            System.out.println("Exception: can not divide by zero");
            
        }
        
        
        
        
    }
    
}
