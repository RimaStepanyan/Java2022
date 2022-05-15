package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

//        Տպեք մասիվի բոլոր էլեմենտները,

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();


//        Տպեք մասիվի ամենամեծ թիվը,

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max=" + max);


//        Տպեք մասիվի ամենափոքրը թիվը,

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min=" + min);


//        Տպեք մասիվի բոլոր զույգ էլեմենտները,


        for (int i = 0; i < array.length; i++) {
            int evenNum = array[i] % 2;
            if (evenNum == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();

//                Տպեք մասիվի բոլոր կենտ էլեմենտները։


        for (int i = 0; i < array.length; i++) {
            int oddNum = array[i] % 2;
            if (oddNum != 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();

//        Տպեք զույգերի քանակը։

        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            int evenNum = array[i] % 2;
            if (evenNum == 0) {
                evenCount = evenCount + 1;
            }
        }
        System.out.println("evenCount=" + evenCount);


//        Տպեք կենտերի քանակը

        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int oddNum = array[i] % 2;
            if (oddNum != 0) {
                oddIndex = oddIndex + 1;
            }
        }
        System.out.println("oddCount=" + oddIndex);

        //        Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)

//        Տպեք մասիվի էլեմենտների գումարը։

        int avg = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("avg=" + sum / array.length);
        System.out.println("sum=" + sum);

    }
}
