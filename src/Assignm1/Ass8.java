package Assignm1;



// Find the index of a given data value in a linked list
// Return -1 if the value is not found
public class Ass8 {

    // تعريف العقدة
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // الدالة المطلوبة لإيجاد موقع القيمة
    static int findIndex(Node head, int value) {
        int index = 0;
        Node current = head;

        // البحث في القائمة
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            current = current.next;
            index++;
        }

        // في حال عدم العثور على القيمة
        return -1;
    }

    // دالة الطباعة (للتجربة فقط)
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

        printList(head);

        int value = 15;
        int index = findIndex(head, value);

        System.out.println("Index of " + value + " is: " + index);
    }
}
