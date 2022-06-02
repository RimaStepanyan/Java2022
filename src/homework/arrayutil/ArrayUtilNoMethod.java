package homework.arrayutil;

public class ArrayUtilNoMethod {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

//        Տպեք մասիվի բոլոր էլեմենտները,

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();


        System.out.println("տպել ամենամեծ էլեմենտը");

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max=" + max);


        System.out.println("տպել ամենափոքր էլեմենտը");

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min=" + min);


        System.out.println("Տպեք մասիվի բոլոր զույգ էլեմենտները");


        for (int i = 0; i < array.length; i++) {
            int evenNum = array[i] % 2;
            if (evenNum == 0) {
                System.out.print(array[i] + " ");
            }
        }


        System.out.println("Տպեք մասիվի բոլոր կենտ էլեմենտները");


        for (int i = 0; i < array.length; i++) {
            int oddNum = array[i] % 2;
            if (oddNum != 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();

        System.out.println("Տպեք մասիվի զույգ էլեմենտների քանակը");

        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            int evenNum = array[i] % 2;
            if (evenNum == 0) {
                evenCount++;
            }
        }
        System.out.println("evenCount=" + evenCount);


        System.out.println("Տպեք մասիվի կենտ էլեմենտների քանակը");

        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int oddNum = array[i] % 2;
            if (oddNum != 0) {
                oddIndex++;
            }
        }
        System.out.println("oddCount=" + oddIndex);

        //        Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)

//        Տպեք մասիվի էլեմենտների գումարը։


        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("էլեմենտների գումարը->>" + sum);
        double avg = sum / array.length;
        System.out.println("միջին թվաբանականը->>" + avg);


    }
}
