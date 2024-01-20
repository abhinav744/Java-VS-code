class TestStack {
    public static void main(String[] args) {
        Stack myStack1=new Stack();
        Stack myStack2=new Stack();

        //push some number onto stack
        for(int i=0;i<10;i++)myStack1.push(i);
        for(int i=10;i<20;i++)myStack2.push(i);

        //pop these number off the stack
        System.out.println("Stack in mystack 1");
        for(int i=0;i<10;i++)
        System.err.println(myStack1.pop());
        System.out.println("Stack in mystack 2");
        for(int i=50;i<60;i++)
        System.err.println(myStack2.pop());
    }    
}
