package src.main.java.linkedlist;

public class LLApp {
    public static void main(String[] args) {
        XLinkedList ll = new XLinkedList();
        System.out.println(ll);
        ll.prepend(10);
        ll.prepend(7);
        ll.prepend(5);
        ll.prepend(1); // 1 -> 3-> 5
        System.out.println(ll); // 3
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

        System.out.println(ll.reverse());
        System.out.println(ll);

    }
}
