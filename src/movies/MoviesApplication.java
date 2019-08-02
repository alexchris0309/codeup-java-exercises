package movies;
import util.Input;
import static movies.MoviesArray.findAll;
//why do we import this movies.MovieArray.findall(); this way?


public class MoviesApplication {

//    public static Movie[] displayMovies(Movie []movie) {
//        for (int i = 0; i < movie.length; i += 1) {
//            System.out.println(movie[i]);
//
//        }
//        return movie;
//
//    }


    public static void main(String[] args) {
        //        how do i import the findall() method in the MoviesArray?



        Input input = new Input();

        String  whatMovie = "What would you like to do?\n";
                whatMovie += "0 - exit\n";
                whatMovie += "1 - view all movies\n";
                whatMovie += "2 - view movies in the animated category\n";
                whatMovie += "3 - view movies in the drama category\n" ;
                whatMovie += "4 - view movies in the horror category\n";
                whatMovie += "5 - view movies in the scifi category\n";
                whatMovie += "\nEnter your choice:\n";

        System.out.println(whatMovie);
        int userInput = input.getInt(0, 5);


        switch (userInput) {
            case 1:
                for (Movie movie : findAll()) {
                    System.out.println(movie.getName() + "----" + movie.getCategory());
                }
                break;
            case 2:
                for (Movie movie : findAll()) {
                    if(movie.getCategory().equals("animated")){
                    System.out.println(movie.getName() + "----" + movie.getCategory());
                }
                }
                break;
            case 3:
                for(Movie movie : findAll()) {
                    if(movie.getCategory().equals("drama")){
                    System.out.println(movie.getName() + "----" + movie.getCategory());
                    }
                }

                break;
            case 4:
                for(Movie movie : findAll()) {
                    if(movie.getCategory().equals("horror")){
                    System.out.println(movie.getName() + "----" + movie.getCategory());
                    }
                }
                break;
            case 5:
                for(Movie movie : findAll()) {
                    if(movie.getCategory().equals("scifi")){
                    System.out.println(movie.getName() + "----" + movie.getCategory());
                    }
                }
                break;
            default:
                System.out.println("cool input");

                break;
        }

    }

    } //class end bracket//

