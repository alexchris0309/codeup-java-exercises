package grades;

public class StudentTest {

    public static void main(String [] args){

         Student newStudent= new  Student("Alex");
         newStudent.addGrade(80);
         newStudent.addGrade(95);
         newStudent.addGrade(100);

        Student newStudent2= new Student("Efrain");
        newStudent2.addGrade(75);
        newStudent2.addGrade(85);
        newStudent2.addGrade(95);






        System.out.println(newStudent.getGradeAverage());
        System.out.println(newStudent2.getGradeAverage());




    }
}
