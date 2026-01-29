package Assignm1;


public class Ass7 {

    // تعريف عقدة القائمة المرتبطة
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // دالة البحث عن عنصر وإرجاع موقعه
    static int search(Node head, int key) {
        int pos = 0;
        while (head != null) {
            if (head.data == key)
                return pos;
            pos++;
            head = head.next;
        }
        return -1; // في حال عدم وجود العنصر
    }

    // دالة الطباعة (اختياري)
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // الدالة الرئيسية
    public static void main(String[] args) {

        // إنشاء القائمة المرتبطة
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);

        System.out.println("القائمة:");
        printList(head);

        int key1 = 15;
        int key2 = 25;

        System.out.println("\nالبحث عن " + key1 + ": الموقع = " + search(head, key1));
        System.out.println("البحث عن " + key2 + ": الموقع = " + search(head, key2));
    }
}
