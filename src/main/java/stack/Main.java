package stack;



public class Main {

    public static void main(String[] args) {

        Stack nums = new Stack();

        nums.push(22);
        nums.push(64);
        nums.push(98);
        System.out.println(nums.pop());
        nums.push(2);
        nums.push(13);
        nums.push(80);
        System.out.println(nums.peek());


        nums.printStack();


    }
}
