package Assignm1;



public class Ass5 {

    // تعريف عقدة القائمة المرتبطة
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // دالة دمج قائمتين مرتبطتين
    static Node concat(Node head1, Node head2) {
        if (head1 == null) return head2;

        Node temp = head1;
        while (temp.next != null)
            temp = temp.next;

        temp.next = head2;
        return head1;
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

    // الدالة الرئيسية
    public static void main(String[] args) {

        // إنشاء القائمة الأولى
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        // إنشاء القائمة الثانية
        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = new Node(6);

        System.out.println("القائمة الأولى:");
        printList(head1);

        System.out.println("القائمة الثانية:");
        printList(head2);

        // دمج القائمتين
        Node merged = concat(head1, head2);

        System.out.println("\nبعد الدمج:");
        printList(merged);
    }
}
