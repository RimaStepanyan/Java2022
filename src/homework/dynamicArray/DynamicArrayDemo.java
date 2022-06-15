package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
       DynamicArray dynArray = new DynamicArray();
    dynArray.add(4);
    dynArray.add(5);
    dynArray.add(6);
    dynArray.add(6);
    dynArray.add(7);
    dynArray.add(6);
    dynArray.add(4);
    dynArray.add(6);
    dynArray.add(4);
        System.out.println(dynArray.getByIndex(2));
        System.out.println(dynArray.getFirstIndexByValue(4));


    }
}
