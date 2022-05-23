package bookExamples.chapter5;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month =scanner.nextInt();
        String season = null;
       if(month == 12 || month == 1 || month == 2){
           season = "Ձմեռ";
       }else if (month == 3 || month == 4 || month == 5){
           season = "Գարուն";
       }else if (month == 6 || month == 7 || month == 8 ){
           season = "Ամառ";
       }else if(month == 9 || month == 10 || month ==11 ){
           season = "Աշուն";
       } else {
           season = "Նման ամիս գոյություն չունի";
       }

        System.out.println(season);
    }
}
