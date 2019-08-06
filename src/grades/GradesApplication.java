package grades;
import java.util.HashMap;
import java.util.Scanner;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input= new Input();
        boolean useranswer;


//        new Student objects

        Student alexandra=new Student("alexandra");
        alexandra.addGrade(90);
        alexandra.addGrade(95);
        alexandra.addGrade(100);


        Student alicia=new Student("alicia");
        alicia.addGrade(80);
        alicia.addGrade(90);
        alicia.addGrade(95);

        Student allison=new Student("allison");
        allison.addGrade(80);
        allison.addGrade(85);
        allison.addGrade(90);


        Student aaron=new Student("aaron");
        aaron.addGrade(80);
        aaron.addGrade(88);
        aaron.addGrade(98);

        Student nullstudent = new Student("there is no student that exist with that username");


//        HashMap

        HashMap<String,Student> students = new HashMap<>();

//                      keys           values
        students.put("alexchris0903",alexandra);
        students.put("aliciaDten",alicia);
        students.put("alliJoes",allison);
        students.put("aaronLovesSweets",aaron);




//        commandline interface

    System.out.println("Here are the Github usernames of our students:");

    for (String username : students.keySet()) {
        System.out.printf(" | %s | ", username);
    }

do {
    System.out.println("\nWhat student would you like to see more information on?");
    String userInput = scanner.nextLine();

    String answer = (students.getOrDefault(userInput, nullstudent).getName());

    System.out.println(answer);

    for (Student student : students.values()) {
        if (answer.equals(student.getName())) {
            System.out.println(student.getGradeAverage());
        }
    }
    System.out.println("Would you like to continue? yes/no");
     useranswer=input.yesNo();

}while(useranswer);

    }
}
