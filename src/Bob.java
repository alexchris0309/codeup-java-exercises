import java.sql.SQLOutput;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {


     do {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Ask Bob a question: ");
         String userQuestion = scanner.nextLine();

         if (userQuestion.endsWith("?")) {
             System.out.println("Sure.");
         } else if (userQuestion.endsWith("!")) {
             System.out.println("Woa,chill out!");
         } else if (userQuestion.equals("")) {
             System.out.println("Fine.Be that way!");
         }
         else  if (userQuestion.equals("bye")){
             System.out.println("Goodbye");
             break;
         }
         else{
             System.out.println("Whatever");
         }

     }while(true);





//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.

    }
}
