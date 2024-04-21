package lr3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        System.out.println(arrayList);

        int index1 = 0;

        long startTime1 = System.nanoTime();

        while (arrayList.size() > 1) {
            index1 = (index1 + 1) % arrayList.size();
            arrayList.remove(index1);
            System.out.println(arrayList);
        }
        long endTime1 = System.nanoTime();
        float executionTime1 = (float) (endTime1 - startTime1)/1000000;
        //long executionTime1 = endTime1 - startTime1;
        System.out.println("Время исполнения кода с применением ArrayList = " + executionTime1 + " мс");

        List<Integer> linkedList = new LinkedList<>();

        for (int i = 1 ; i <= 10 ; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);

        int index2 = 0;

        long startTime2 = System.nanoTime();

        while (linkedList.size() > 1) {
            index2 = (index2 + 1) % linkedList.size();
            linkedList.remove(index2);
            System.out.println(linkedList);
        }
        long endTime2 = System.nanoTime();
        float executionTime2 = (float) (endTime2 - startTime2)/1000000;
        //long executionTime2 = endTime2 - startTime2;
        System.out.println("Время исполнения кода с применением LinkedList = " + executionTime2 + " мс");
    }
}
