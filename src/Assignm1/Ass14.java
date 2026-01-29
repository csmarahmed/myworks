package Assignm1;

public class Ass14 {

    // تعريف العقدة
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // دالة الطباعة لقائمة دائرية
    static void printCLL(Node head) {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to " + head.data + ")");
    }

    // دالة الحذف من موقع محدد
    static Node delete(Node head, int pos) {
        if (head == null) return null;

        // حذف العقدة الأولى
        if (pos == 0) {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = head.next;
            return head.next;
        }

        // حذف عقدة في موقع آخر
        Node curr = head;
        for (int i = 0; i < pos - 1; i++)
            curr = curr.next;

        curr.next = curr.next.next;
        return head;
    }

    // الدالة الرئيسية
    public static void main(String[] args) {

        // إنشاء القائمة الدائرية
        Node head = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = head; // تجعلها دائرية

        System.out.println("القائمة الأصلية:");
        printCLL(head);

        // حذف العنصر في الموقع 2 (العقدة التي تحمل 15)
        head = delete(head, 2);

        System.out.println("\nبعد الحذف من الموقع 2:");
        printCLL(head);

        // حذف العنصر الأول
        head = delete(head, 0);

        System.out.println("\nبعد الحذف من الموقع 0:");
        printCLL(head);
    }
}
