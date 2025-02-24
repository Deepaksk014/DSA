package stack;

public class Stack {

    int[] arr = new int[5];
    int top ;
    int size;

    public Stack(){
        top=-1;
        size=arr.length;
    }


    public void push(int data) {

        top++;

        if(top<size){
            arr[top]= data;
        }
        else {
            System.out.println("stack overflow");
        }
    }

    public void printStack() {

        for(int num : arr){
            System.out.print(num + " " );
        }
    }

    public int pop() {

        if (top> -1){
            return arr[top--];
        }
        else {
            System.out.println("stack underflow");
        }
        return 0;
    }

    public int peek() {
        return arr[top];
    }
}
