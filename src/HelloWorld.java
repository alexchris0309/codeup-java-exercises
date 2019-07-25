public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");


            int myFavoriteNumber = 3;
            System.out.println(myFavoriteNumber);
//
//            String myString ='c';
//            System.out.println(myString);

            float myNumber =3.14f;
            System.out.println(myNumber);
            int a = 5;
            System.out.println(a++);
            System.out.println(a);
            int b = 5;
            System.out.println(++b);
            System.out.println(b);

//
//            String theNumberThree = "three";
//            Object o = theNumberThree;
//            int three = (int) o;
//            int three = (int) "three";
//
//            int x = 4;
//             x += 5;
//
//            int x = 3;
//            int y = 4;
//             y *= x;
//
//            int x = 10;
//            int y = 2;
//             x /= y;
//            y -= x;

            int max = Integer.MAX_VALUE;
            System.out.println(max);
            max++;
            System.out.println(max);
//            it rolls over to -  (roll over to min value)

            byte lil=(byte)max;
            System.out.println(lil);

        }
}

