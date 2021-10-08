public class Normal_Stack_Build {
    public static void main(String[] args){
        CustomStack cs = new CustomStack(5);
        cs.push(10);
        cs.push(20);
        cs.push(30);
        cs.push(50);
        cs.display();
        System.out.println(cs.pop());
        System.out.println(cs.top());
        cs.display();
        cs.push(40);
        System.out.println(cs.size());
        cs.display();

    }

    public static class CustomStack {
        int[] data;
        int tos;

        public CustomStack(int cap) {
            data = new int[cap];
            tos = -1;
        }

        int size() {
            return tos + 1;
        }

        void display() {
            for(int i = tos; i >= 0; i--){
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        void push(int val) {
            if(tos == data.length - 1){
                System.out.println("Stack Overflow !!");
            }else {
                tos++;
                data[tos] = val;
            }
        }

        int pop() {
            if(tos == -1){
                System.out.println("Empty Stack OR Stack Underflow !!");
                return -1;
            }else{
                int val = data[tos];
                tos--;
                return val;
            }
        }

        int top() {
            if(tos == -1) {
                System.out.println("Empty Stack OR Stack Underflow !!");
                return -1;
            }else {
                return data[tos];
            }
        }
    }
}
