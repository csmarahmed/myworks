package Assignm1;



public class Ass6 {

    // تعريف عقدة القائمة المرتبطة
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // دالة تدوير القائمة لليمين بمقدار k
    static Node rotate(Node head, int k) {
        if (head == null || k == 0) return head;

        // حساب طول القائمة
        Node curr = head;
        int len = 1;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }

        // ربط النهاية بالبداية لجعلها دائرية مؤقتًا
        curr.next = head;

        k = k % len; // التعامل مع k أكبر من طول القائمة
        int steps = len - k;

        // إيجاد العنصر الأخير بعد التدوير
        Node newTail = curr;
        while (steps-- > 0)
            newTail = newTail.next;

        Node newHead = newTail.next;
        newTail.next = null; // فصل القائمة مرة أخرى

        return newHead;
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

        // إنشاء القائمة المرتبطة
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("القائمة الأصلية:");
        printList(head);

        int k = 2;
        head = rotate(head, k);

        System.out.println("\nبعد التدوير بمقدار " + k + ":");
        printList(head);
    }
}
