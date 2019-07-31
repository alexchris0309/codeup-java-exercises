public class ServerNameGenerator {
   public static  String [] adjectives= { "aggressive","agreeable","ambitious","brave", "calm","delightful","eager", "faithful","academic","absolute"};


   public static String [] noun= {"man","mountain","cat","dog","fish","hamster","turtle","lizard","building","website"};


    public static int getRandomNum(String array[]){
    return (int)Math.floor(Math.random()*array.length);
   }


    public static void main(String[] args) {
        int randomIndex= getRandomNum(adjectives);
        int randomIndex2=getRandomNum(noun);

        System.out.printf("%s-%s", adjectives[randomIndex], noun[randomIndex2]);
//        System.out.println(randomName());

    }
}

