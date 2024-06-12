package src.main.java.linkedlist;

import java.util.NoSuchElementException;

public class XLinkedList {

    static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this(value, null);
        }

        @Override
        public String toString() {
            return String.format("[%d]", value);
        }
    }

    private Node head;

    public void prepend(int value) {
        head = new Node(value, head);
//        System.out.println("prepend/ head: " + head.value);
//        System.out.println("prepend/ head: " + head.next);
    }

    public void append(int value) {
        if (isEmptyJava()) {
            append(value);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(value);
    }

    public void removeHead() {
        if (head == null) throw new NoSuchElementException();
        head = head.next;
    }

    public int takeHead() {
        if (head == null) throw new NoSuchElementException();
        Node savedHead = head;
        head = head.next;
        return savedHead.value;
    }

    int sizeTR(Node curr, int len) {
        return curr == null ? len : sizeTR(curr.next, len + 1);
    }

    int sizeTR() {
        return sizeTR(head, 0);
    }

    int sizeR(Node curr) {
        return curr == null ? 0 : 1 + sizeR(curr.next);
    }

    int sizeR() {
        return sizeR(head);
    }

    int size() {
        int size = 0;
        Node curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }

    boolean isEmptyMath() {
        return size() == 0;
    }

    boolean isEmptyJava() {
        return head == null;
    }

    boolean containsR(int value, Node curr) {
        if (curr == null) return false;
        return curr.value == value || containsR(value, curr.next);
    }

    boolean containsR(int value) {
        return containsR(value, head);
    }

    boolean contains(int value) {
        Node curr = head;
        while (curr != null) {
            if (curr.value == value) return true;
            curr = curr.next;
        }
        return false;
    }

    public void insertAfter(int value, int after) {
        Node curr = head;
        while (curr != null) {
            if (curr.value == after) {
                Node savedNext = curr.next;
                curr.next = new Node(value, savedNext);
                return;
            }
            System.out.println("insertAfter/ curr.value " + curr.value);
            System.out.println("insertAfter/ curr.next " + curr.next);
            curr = curr.next;
        }
    }

    public void insertSorted(int value) {
        // if empty || value <= head.value
        if (isEmptyJava() || value <= head.value) {
            prepend(value);
            return;
        }
        Node curr = head;
        while (true) {
            // add to end of the list
            if (curr.next == null) {
                curr.next = new Node(value);
                return;
            }
            // normal case
            if (curr.next.value >= value) {
                Node savedNext = curr.next;
                curr.next = new Node(value, savedNext);
                return;
            }
            curr = curr.next;
        }
    }

    public boolean reverse() {
        Node curr = head;
        head = null;
        Node newListNode = new Node(curr.value);
        prepend(newListNode.value);
        while (curr.next != null) {
            curr = curr.next;
            newListNode = new Node(curr.value);
            prepend(newListNode.value);
        }
        return false;
    }

    public Node reverseR(Node curr) {
        curr = curr.next;
        Node newListNode = new Node(curr.value);
        prepend(newListNode.value);
        return curr;
    }

    public void reverseR() {
        Node curr = head;
        head = null;
        Node newListNode = new Node(curr.value);
        prepend(newListNode.value);
        while (curr.next != null) {
            curr = reverseR(curr);
        }
    }

    /** new Node is prohibited */
    public void reverseR2() {

    }

    @Override
    public String toString() {
        if (head == null) return "LL: empty";
        StringBuilder sb = new StringBuilder("LL: ");
        Node curr = head;
        while (curr != null) {
            if (curr != head) sb.append(" -> ");
            sb.append(curr);
            curr = curr.next;
        }
        return sb.toString();
    }
}
