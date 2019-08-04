package movies;
import util.Input;


public class MoviesApplication {


    public static void main(String[] args) {

        Input input = new Input();
        int userInput;


        Movie[] movies = MoviesArray.findAll();


        String whatMovie = "\nWhat would you like to do?\n";
        whatMovie += "0 - exit\n";
        whatMovie += "1 - view all movies\n";
        whatMovie += "2 - view movies in the animated category\n";
        whatMovie += "3 - view movies in the drama category\n";
        whatMovie += "4 - view movies in the horror category\n";
        whatMovie += "5 - view movies in the scifi category\n";
        whatMovie += "\nEnter your choice:\n\n";
do{
        System.out.println(whatMovie);
        userInput = input.getInt();




            switch (userInput) {
                case 0:

                    System.out.println("you have chose to exit");
                    break;


                case 1:
                    for (Movie movie : movies) {
                        System.out.println(movie.getCategory() + "-------" + movie.getName());
                    }


                    break;

                case 2:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("animated")) {
                            System.out.println(movie.getCategory() + "-------" + movie.getName());
                        }
                    }

                    break;
                case 3:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("drama")) {
                            System.out.println(movie.getCategory() + "-------" + movie.getName());
                        }
                    }
                case 4:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("horror")) {
                            System.out.println(movie.getCategory() + "-------" + movie.getName());
                        }
                    }
                case 5:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("scifi")) {
                            System.out.println(movie.getCategory() + "-------" + movie.getName());
                        }
                    }

                default:
                    break;
            }

        } while (userInput !=0);
    }

} //class end bracket//

