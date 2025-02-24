package linkedList;



public class main {

    public static void main(String[] args) {

        LinkedList nums = new LinkedList();

        nums.add(14);
        nums.add(19);
        nums.add(103);
        nums.add(28);

        nums.add(12);

        nums.addFirst(108);

        nums.delete(103);

        nums.printLinkedList();
    }
}
