class A{
    void callme(){
        System.out.println("Inside A method");
    }
}
class B extends A{
    void callme(){
        System.out.println("Inside B method");
    }
}
class C extends A{
    void callme(){
        System.out.println("Inside C method");
    }
}

class Dispatch {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();

        A r;    //obtain reference of type A

        r=a;    //refers to A object
        r.callme(); //call A's version of callme
        r=b;
        r.callme();
        r=c;
        r.callme();
    }
}
