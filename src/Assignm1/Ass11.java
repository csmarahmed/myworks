package Assignm1;


public class Ass11 {

    // تعريف عقدة القائمة الثنائية
    static class DNode {
        int data;
        DNode next;
        DNode prev;

        DNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // دالة الطباعة بالعكس
    static void reversePrint(DNode head) {
        if (head == null) return;

        // الذهاب إلى آخر عقدة
        DNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        // الطباعة بالعكس
        System.out.print("القائمة بالعكس: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // دالة الطباعة الأمامية (اختياري)
    static void printDLL(DNode head) {
        DNode temp = head;
        System.out.print("القائمة: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // الدالة الرئيسية
    public static void main(String[] args) {

        // إنشاء القائمة الثنائية
        DNode head = new DNode(5);
        DNode second = new DNode(10);
        DNode third = new DNode(15);
        DNode fourth = new DNode(20);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        // الطباعة الأمامية
        printDLL(head);

        // الطباعة بالعكس
        reversePrint(head);
    }
}
