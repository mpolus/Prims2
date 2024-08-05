public class Prims {
    public static void main(String[] args) {

        byte myMinByteValue = -128;
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        int myNewInt = myMinByteValue;

        float myFloatValue = 23.243F;
        float myFloatValue2 = 1.4e-3F;   //1.4 * 10^-3
        System.out.println(myFloatValue);
        System.out.println(myFloatValue2);

        double myDoubleValue = -78.748558585;
        double myDoubleValue2 = 1.8e14;

        System.out.println(myDoubleValue);
        System.out.println(myDoubleValue2);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        double answer = 3.0 / 2.0;
        System.out.println(answer);

        
    }
}
