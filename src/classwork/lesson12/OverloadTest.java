package classwork.lesson12;

public class OverloadTest {

    void test() {
        System.out.println("I am test()");

    }

    int test(int a) {
        System.out.println("I am test(int a)");
        return 0;
    }
    void test(String a){
        System.out.println("I am test(String a)");
    }

}
