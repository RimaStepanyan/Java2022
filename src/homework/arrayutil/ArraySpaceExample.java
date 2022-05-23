package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int beginIndex = 0;
        int endIndex = spaceArray.length - 1;
        while (beginIndex < endIndex && spaceArray[beginIndex] == ' ') {
            beginIndex++;
        }
        while (beginIndex < endIndex && spaceArray[endIndex] == ' ') {
            endIndex--;
        }
        char[] result = new char[(endIndex - beginIndex) + 1];
        int index = 0;
        for (int i = beginIndex; i < endIndex+1; i++) {
            result[index] = spaceArray[i];
            index++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

    }
}

