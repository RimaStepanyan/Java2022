package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
//        Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։


        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                index++;
            }
        }
        System.out.println(index);

//                պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e',};
        int x = chars2.length;
        System.out.print((chars2[(x / 2) -1]) + " " + chars2[x / 2]);


        System.out.println();
//                պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            System.out.println("true");
        } else {
            System.out.println(false);
        }


//Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

//       պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }

    }
}
