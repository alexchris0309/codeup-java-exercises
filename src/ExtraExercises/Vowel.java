package ExtraExercises;

public class Vowel {
//    Create a vowel counting method for each vowel in the alphabet (not including y). Each method, when passed a string, should return how many of that vowel is in the string. Given a string, use all of the these vowel counting methods to output the count of each vowel in a word.
//
//    For example:
//
//    countVowels("cat")
//    Should output:
//
//            |======== VOWEL COUNT ========|
//            | A's | E's | I's | O's | U's |
//            | 1   | 0   | 0   | 0   | 0   |
//            |=============================|


   public static String countVowels(String word){
       word=word.toLowerCase();
       int aCount=0;
       int eCount=0;
       int iCount=0;
       int oCount=0;
       int uCount=0;
       for (int i = 0; i < word.length(); i++)
       {
           if (word.charAt(i) == 'a' ) {
               aCount++;
           }
           if (word.charAt(i) == 'e' ) {
               eCount++;
           }
           if (word.charAt(i) == 'i' ) {
               iCount++;
           }
           if (word.charAt(i) == 'o' ) {
               oCount++;
           }
           if (word.charAt(i) == 'u' ) {
                uCount++;
            }
       }
//       System.out.println("|  A's |  E's | I's | O's | U's |");
        return  "the total of each vowel in "+word+" is: " +"A has "+aCount +", E has " +eCount +", I has " + iCount+", O has "+ oCount + ", U has "+ uCount;
//       System.out.println("|===============================|");


   }


    public static void main(String[] args) {
        System.out.println(countVowels("Efrain"));

    }
}
