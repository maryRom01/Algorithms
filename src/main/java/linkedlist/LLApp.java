package src.main.java.linkedlist;

import java.util.Arrays;
import java.util.Random;

public class LLApp {

    public static XLinkedList getRandomArray() {
        int[] randoms = new Random().ints(20, 1, 100)
                .toArray();
        XLinkedList ll = new XLinkedList();
        for (int r: randoms) {
            ll.insertSorted(r);
        }
        System.out.println(ll);
        return ll;
    }

    public static void printList(XLinkedList ll) {
        System.out.println(ll);
        System.out.println("----------------------------------------------");
    }

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

//        int[] randoms = new Random().ints(20, 1, 100)
//                .toArray();

        XLinkedList ll = getRandomArray();
                System.out.println(ll.reverse());
        printList(ll);

        ll = getRandomArray();
        ll.reverseR();
        printList(ll);

        ll = getRandomArray();
        ll.reverseR2();
        printList(ll);

        ll = getRandomArray();
        ll.reverseR3();
        printList(ll);
    }
}
