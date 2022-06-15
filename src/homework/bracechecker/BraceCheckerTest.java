package homework.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "Hello (from] [Jav)a";
        BraceChecker bc = new BraceChecker(text);
        bc.check();

          }
}
