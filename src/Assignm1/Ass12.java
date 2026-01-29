package Assignm1;

public class Ass12 {

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

    // دالة البحث في القائمة الثنائية
    static boolean search(DNode head, int key) {
        while (head != null) {
            if (head.data == key)
                return true;
            head = head.next;
        }
        return false;
    }

    // دالة الطباعة (اختياري)
    static void printDLL(DNode head) {
        DNode temp = head;
        System.out.print("null <- ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // الدالة الرئيسية
    public static void main(String[] args) {

        // إنشاء القائمة الثنائية
        DNode head = new DNode(5);
        DNode second = new DNode(10);
        DNode third = new DNode(15);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        System.out.println("القائمة الثنائية:");
        printDLL(head);

        int key1 = 10;
        int key2 = 20;

        System.out.println("\nالبحث عن " + key1 + ": " + (search(head, key1) ? "موجود" : "غير موجود"));
        System.out.println("البحث عن " + key2 + ": " + (search(head, key2) ? "موجود" : "غير موجود"));
    }
}
