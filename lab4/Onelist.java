public class Onelist
{
    private Node head;

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data) {
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public void printLinkedList(){
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.print("NULL");
    }

    public void clearList(){
        Node current = head;
        while (current != null) {
            current = current.next;
        }
        head = current;
    }

    public int lenght(){
        Node current = head;
        int lenght = 0;
        while (current != null) {
            lenght++;
            current = current.next;
        }
        return lenght;
    }

    public boolean isEmpty(){
        if (head == null){return true;}
        return false;
    }

    public void deleteFirst(){
        head = head.next;
    }

    public void deleteLast(){
        Node current = head;
        Node temp = head;
        while (current.next != null){
            temp = current;
            current = current.next;
        }
        current = temp;
        current.next = null;
    }

    public boolean include(int value){
        Node current = head;
        while (current != null){
            if (current.data == value) return true;
            current = current.next;
        }
        return false;
    }

    public int max(){
        Node current = head;
        int max = current.data;
        while(current != null){
            if (current.data > max) max = current.data;
            current = current.next;
        }
        return max;
    }

    public int min(){
        Node current = head;
        int min = current.data;
        while(current != null){
            if (current.data < min) min = current.data;
            current = current.next;
        }
        return min;
    }


    public void deleteValue(){

    }

    public void deleteAllValue(){

    }

    public void replaceAll(int oldValue, int newValue){
        Node current = head;
        while (current != null){
            if (current.data == oldValue) current.data = newValue;
            current = current.next;
        }
    }

    
}