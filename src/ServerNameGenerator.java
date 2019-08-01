import java.util.Arrays;
import java.util.Random;


public class ServerNameGenerator {
   public static  String [] adjectives= { "aggressive","agreeable","ambitious","brave", "calm","delightful","eager", "faithful","academic","absolute"};


   public static String [] noun= {"man","mountain","cat","dog","fish","hamster","turtle","lizard","building","website"};


    public static int getRandomNum(String array[]){
    return (int)Math.floor(Math.random()*array.length);
   }

//   public static String randomElement(String[] strings){
//        int sng=(int)Math.random()*strings.length;
//        return strings[sng];
//   }


//another way to add new array:

//    public String[] adjectives
//   public ServerNameGenerator(){
//       adjectives = new String[12];
//       adjectives[0]="man";
//       adjectives[1]="mountain";
//       adjectives[2]="cat";
//       adjectives[3]="dog";
//       adjectives[4]="fish";
//       adjectives[5]="hamster";
//       adjectives[6]="turtle";
//       adjectives[7]="lizard";
//       adjectives[8]="building";
//       adjectives[9]="website";
//
//   }






    public static void main(String[] args) {

//        ServerNameGenerator sng = new ServerNameGenerator();
//        System.out.println(sng.noun);
//        System.out.println();
//        System.out.println("%s-%s", randomElement(sng.adjective), randomeElement(sng.noun));



        int randomIndex= getRandomNum(adjectives);
        int randomIndex2=getRandomNum(noun);

        System.out.printf("Your random name is : %s-%s", adjectives[randomIndex], noun[randomIndex2]);
//        System.out.println(randomName());

    }
}

