package grades;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private String name;
    private ArrayList<Integer> grades;


//constructor

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

//methods


    // returns the student's name
    public String getName() {

        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {

        this.grades.add(grade);
    }

// returns the average of the students grades

    public double getGradeAverage() {
//        Collections.sort(grades); can use to sort if import but not necessary for this problem
        int sum = 0;
        for (int i = 0; i < grades.size(); i++)
            sum += grades.get(i);
        //calculate average value
        double average = sum / grades.size();
        return average;


    }



}