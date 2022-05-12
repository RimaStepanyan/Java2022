package bookExamples.chpater3;

public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y հավասար է " + y);
            y = 100;
            System.out.println("y այժմ հավասար է " + y);

        }
    }
}
