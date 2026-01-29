package Assignm1;



// Question 9: Remove node at specific position

// Question 9: Remove a node at a specific position in Singly Linked List
public class Ass9 {

    // تعريف العقدة
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // دالة الحذف
    static Node removeAtPosition(Node head, int position) {

        // إذا كانت القائمة فارغة
        if (head == null) {
            return head;
        }

        // إذا كان الحذف من أول عنصر
        if (position == 0) {
            return head.next;
        }

        Node current = head;

        // الوصول للعقدة التي قبل الموضع
        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        // حذف العقدة
        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    // دالة الطباعة
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // الدالة الرئيسية للاختبار
    public static void main(String[] args) {

        // إنشاء القائمة
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Before deletion:");
        printList(head);

        // حذف العنصر في الموضع 2
        head = removeAtPosition(head, 2);

        System.out.println("After deletion:");
        printList(head);
    }
}
