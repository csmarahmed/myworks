package Assignm1;


public class Ass10 {

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

    // دالة إزالة العناصر المكررة
    static void removeDuplicates(DNode head) {
        for (DNode i = head; i != null; i = i.next) {
            for (DNode j = i.next; j != null;) {
                if (i.data == j.data) {
                    j.prev.next = j.next;
                    if (j.next != null)
                        j.next.prev = j.prev;
                }
                j = j.next;
            }
        }
    }

    // دالة الطباعة
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

        // إنشاء القائمة الثنائية مع عناصر مكررة
        DNode head = new DNode(5);
        DNode second = new DNode(10);
        DNode third = new DNode(5);
        DNode fourth = new DNode(20);
        DNode fifth = new DNode(10);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        System.out.println("القائمة الأصلية:");
        printDLL(head);

        // إزالة العناصر المكررة
        removeDuplicates(head);

        System.out.println("\nبعد إزالة العناصر المكررة:");
        printDLL(head);
    }
}
