package movies;
import util.Input;
public class MoviesApplication {


    public static void main(String[] args) {
       Input input = new Input();


       Movie[] movie=MoviesArray.findAll();


       String whatMovie="What would you like to do?\n";
       whatMovie +="0 - exit\n" +
               "\n1 - view all movies\n" +
               "2 - view movies in the animated category\n" +
               "3 - view movies in the drama category\n" +
               "4 - view movies in the horror category\n" +
               "5 - view movies in the scifi category\n";
      whatMovie+="\nEnter your choice:\n";

        System.out.println(whatMovie);
        int userInput= input.getInt(0,5);

        switch(userInput) {
            case 0:
                // code block
                break;
            case 1:
                // code block
                break;
            case 2:
                // code block
                break;
            case 3:
                // code block
                break;
            case 4:
                // code block
                break;
            case 5:
                // code block
                break;




            default:
                // code block
        }



        }
//        int answer=input.getInt(0,5);







    }

