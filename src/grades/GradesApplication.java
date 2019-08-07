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

//    do while loop

    do {

    System.out.println("\nWhat student would you like to see more information on?");
    String userInput = scanner.nextLine();
    String answer = (students.getOrDefault(userInput, nullstudent).getName());
    System.out.println("Students name is: "+ answer);

    for (Student student : students.values()) {
        if (answer.equals(student.getName())) {
            System.out.println("this is their grade average: \n"+student.getGradeAverage());
            System.out.println("List of this Students Grades:");
            for(Integer grade:student.getGrades()){
                System.out.println( grade);
            }
        }
    }

    System.out.println("Would you like to continue? yes/no");
     useranswer=input.yesNo();

    }while(useranswer);


        //    prints all all the Students names and Grades

    System.out.println("would you like to see a list of all the students Grades?");
    boolean userInput = input.yesNo();

    if(userInput=true) {

        for (Student student : students.values()) {
            System.out.println("\n Student name is: " + student.getName());

            System.out.println("their list of Grades is: ");
            for (Integer grade : student.getGrades()) { System.out.println(grade); }
        }
    }

    else { System.out.println("no problem"); }


    }


}

