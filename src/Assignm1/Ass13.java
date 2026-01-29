package Assignm1;

public class Ass13 {

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

    // دالة الإدراج في موقع محدد
    static Node insert(Node head, int data, int pos) {
        Node newNode = new Node(data);

        // إدراج في البداية
        if (pos == 0) {
            if (head == null) {
                newNode.next = newNode; // العقدة الوحيدة تصبح دائرية
                return newNode;
            }
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = newNode;
            newNode.next = head;
            return newNode;
        }

        // إدراج في موقع آخر
        Node curr = head;
        for (int i = 0; i < pos - 1; i++)
            curr = curr.next;

        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    // الدالة الرئيسية
    public static void main(String[] args) {

        Node head = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);

        head.next = second;
        second.next = third;
        third.next = head; // تجعلها دائرية

        System.out.println("القائمة الأصلية:");
        printCLL(head);

        // إدراج في الموقع 0
        head = insert(head, 1, 0);
        System.out.println("\nبعد الإدراج 1 في الموقع 0:");
        printCLL(head);

        // إدراج في الموقع 2
        head = insert(head, 7, 2);
        System.out.println("\nبعد الإدراج 7 في الموقع 2:");
        printCLL(head);

        // إدراج في نهاية القائمة
        head = insert(head, 20, 6); // الموقع بعد آخر عقدة
        System.out.println("\nبعد الإدراج 20 في النهاية:");
        printCLL(head);
    }
}
