package bookExamples.chpater3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

         b = false;
        System.out.println("b-ն հավասար է " + b);
        b = true;
        System.out.println("b-ն հավասար է " + b);

        if(b){
            System.out.println("Այս կոդն աշխատում է");
        }
        b = false;
            if(b); {
            System.out.println("Այս կոդը չի աշխատում" );
        }
        System.out.println("10 > 9 հավասար է " + (10 > 9));


    }
}
