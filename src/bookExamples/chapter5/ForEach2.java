package bookExamples.chapter5;

public class ForEach2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int num : nums) {
            System.out.println("Թիվը հավասար է։ " + num);
            sum +=num;
            if(num == 5) break;
        }
        System.out.println("Առաջին 5 տարրերի գումարը հավասար է։" + sum);
    }
}
