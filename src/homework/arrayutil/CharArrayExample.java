package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
//        Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։


        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("count=" + count);

//                պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e',};

        int middleIndex = chars.length/2;
        System.out.print(chars2[middleIndex - 1]);
        System.out.println(chars2[middleIndex]);
//        int x = chars2.length;
//        System.out.print((chars2[(x / 2) - 1]) + " " + chars2[x / 2]);


//                պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        int lastIndex = chars3.length-1;
        boolean lyResult = false;
        if(chars3[lastIndex-1] == 'l'
                && chars3[lastIndex] == 'y'){
            lyResult = true;
        }
        System.out.println("lyResult-> " + lyResult);

//        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
//            System.out.println("true");
//        } else {
//            System.out.println(false);
//        }


//Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        char[] bobArray = {'k', 'a', 'l', 'o', 'l', 'b'};
        boolean bobThere = false;
        for (int i = 0; i < bobArray.length-2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bobThere = true;
                break;
            }
        }
        System.out.println("bobThere-> " + bobThere);

//       պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.

        char[] text = {' ', ' ', 'b', 'a', ' ', 'r', 'e', 'v', ' ', ' '};
        for (char c1 : text) {
            if(c1 != ' '){
                System.out.print(c1);
            }
        }
//        for (int i = 0; i < text.length; i++) {
//            if (text[i] != ' ') {
//                System.out.print(text[i]);
//            }
//        }

    }
}
