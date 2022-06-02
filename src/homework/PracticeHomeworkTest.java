package homework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework prH = new PracticeHomework();
        System.out.println(prH.convert(1));
        System.out.println(prH.calcAge(1));
        System.out.println(prH.nextNumber(5));
        System.out.println(prH.isSameNum(5, 5));
        System.out.println(prH.lessThanOrEqualToZero(7));
        System.out.println(prH.reverseBool(false));
        System.out.println(prH.maxLength(new int[10],new int[25]));

    }
}
