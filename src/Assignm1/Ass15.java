package Assignm1;

public class Ass15 {

    // تعريف العقدة
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    static boolean search(Node head, int key) {
        if (head == null) return false; // في حال كانت القائمة فارغة

        Node temp = head;
        do {
            if (temp.data == key)
                return true;
            temp = temp.next;
        } while (temp != head);

        return false;
    }


    public static void main(String[] args) {

        // إنشاء القائمة الدائرية
        Node head = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);

        head.next = second;
        second.next = third;
        third.next = head; // يجعلها دائرية

        int key = 10;

        if (search(head, key)) {
            System.out.println(key + " موجود في القائمة.");
        } else {
            System.out.println(key + " غير موجود في القائمة.");
        }
    }
}
