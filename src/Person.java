public class Person {

    private String name;

    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        this.name=name;
    }
    public void sayHello(){
        System.out.printf("%s says Hello!",this.name);

    }
//constructor
    public Person(String name){

        this.name=name;
    }

    public static void main(String[] args) {

        Person alex = new Person("Alex");
        alex.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
////
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());





    }


}



