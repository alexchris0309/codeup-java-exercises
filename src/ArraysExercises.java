import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people,Person newperson){
        people= Arrays.copyOf(people, people.length+1);
        people[people.length-1]=newperson;
        return people;



    }



    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] people= new Person[3];
        people[0] = new Person("Julia");
        people[1] = new Person("Brooke");
        people[2] = new Person("Genesis");

        for ( Person peep : people) {
            System.out.println(peep.getName());
        }


//        newpeep= new Person("Alicia");

        Person[] newGroup = addPerson(people, new Person("Alicia"));
        for (Person peep : newGroup) {
            System.out.println(peep.getName());
        }


    }
}
