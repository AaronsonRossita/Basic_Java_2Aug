public class Main {

    // p     s     v     m
    public static void main(String[] args) {

        // sout
        System.out.println("Hello World");

        byte myByte = 127; // -128 .. 127
        short myShort = 257;
        int myInt = 2147483647;
        long myLong = 30L;

        float myFloat = 2.46778f;
        double myDouble = 2.3;

        boolean myBoolean = true;

        char myChar = 'a';

        String myString = "a";

        // Create Read Update Delete

        int x;
        x = 7;
        System.out.println(x);
        x = 8;
        System.out.println(x);

        myDouble = myByte; // widening casting byte -> short -> int -> long -> float -> double
        myByte = (byte)myShort; // narrowing casting double -> float -> long -> int -> short -> byte

        System.out.println(myByte);


    }


}





