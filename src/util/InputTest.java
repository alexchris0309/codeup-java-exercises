package util;

public class InputTest {
    public static void main(String [] args){

        Input input1 =new Input();
        System.out.println(input1.getString());
        System.out.println(input1.yesNo());
        System.out.println(input1.getInt(1,10));
        System.out.println(input1.getInt());
        System.out.println(input1.getDouble(1.5,5.5));
        System.out.println(input1.getDouble());

    }
}
