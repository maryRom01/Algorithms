package src.main.java.linkedlist;

import java.util.Arrays;
import java.util.Random;

public class LLApp {
    public static void main(String[] args) {
//        XLinkedList ll = new XLinkedList();
//
//        ll.prepend(10);
//        ll.prepend(7);
//        ll.prepend(5);
//        ll.prepend(1); // 1 -> 3-> 5
//        System.out.println(ll); // 3
//        System.out.println(ll.contains(3));
//        System.out.println(ll.contains(4));
//        ll.insertAfter(4, 3);
//        System.out.println(ll); // 1 -> 3 -> 4 -> 5
//        ll.insertAfter(10, 5);
//        System.out.println(ll); // [1] -> [3] -> [4] -> [5] -> [10]
//        ll.insertSorted(0);
//        System.out.println(ll); // [0] -> [1] -> [3] -> [4] -> [5] -> [10]
//        ll.insertSorted(6);
//        System.out.println(ll); // [0] -> [1] -> [3] -> [4] -> [5] -> [6] -> [10]
//        ll.insertSorted(9);
//        System.out.println(ll); // [0] -> [1] -> [3] -> [4] -> [5] -> [6] -> [9] -> [10]
//        ll.insertSorted(100);
//        System.out.println(ll); // [0] -> [1] -> [3] -> [4] -> [5] -> [6] -> [9] -> [10] -> [100]

//        System.out.println(ll.reverse());
//        System.out.println(ll);

//        ll.reverseR();
//        System.out.println(ll);

        int[] randoms = new Random().ints(20, 1, 100)
                .toArray();

        System.out.println(Arrays.toString(randoms));
        XLinkedList ll = new XLinkedList();
        for (int r: randoms) {
            ll.insertSorted(r);
        }

        System.out.println(ll);

        ll.reverseR2();
        System.out.println(ll);
    }
}
