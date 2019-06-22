import java.util.Scanner;
class stack {
    int top = -1, size = 5, num;
    int arr[] = new int[size];
    void push(int num) {
        this.num = num;
        if (top >= size-1) {
            System.out.println("Overflow");
        }    
        else {
            arr[++top] = num;
        }
    }
    void pop() {
        if(top == -1) {
            System.out.println("Underflow");
        }
        else {
            top--;
        }
    }
    void peek() {
        if(top == -1) {
            System.out.println("Underflow");
        }
        else {
            System.out.println(arr[top]);
        }
    }
    void display() {
        for(int i = 0 ; i <= top ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        stack s1 = new stack();
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            int ch = input.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter number to push");
                    int n = input.nextInt();
                    s1.push(n);
                    break;
                case 2:
                    s1.pop();
                    break;
                case 3:
                    s1.peek();
                    break;
                case 4:
                    s1.display();
                    break;
            }
        }
    }
}