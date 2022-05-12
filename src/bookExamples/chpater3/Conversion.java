package bookExamples.chpater3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        b = (byte) i;
        System.out.println("i և b" + i + " " + b);

        System.out.println(i = (int) d);
        System.out.println("d և i " + d + " " + i);

                b = (byte) d;
        System.out.println("d և b" + d + " " + b);

    }
}
