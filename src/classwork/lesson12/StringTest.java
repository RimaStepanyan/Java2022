package classwork.lesson12;

import java.util.Locale;

public class StringTest {

    public static void main(String[] args) {

        String name = "Poxos Poxosyan";
//        name = name.trim();
//        System.out.println(name.toUpperCase(Locale.ROOT));
//        System.out.println(name.toLowerCase(Locale.ROOT));
//
//       String ly = "sjbkabjalyvbjkvbakjd";
//        System.out.println(ly.endsWith(ly));
//        System.out.println(ly.startsWith(ly));
//        System.out.println(ly.contains(ly));
//
//        String subName = name.substring(6);
//        System.out.println(subName);
//        System.out.println("length: " + name.length());


//        String[] s = name.split(" ");
//        System.out.println(s[0]);
//        System.out.println(s[1]);
//        System.out.println(s[2]);

        char[] chars = name.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                result += "O";
            } else {
                result += chars[i];
            }
        }
        System.out.println(result);


        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }


    }
}
