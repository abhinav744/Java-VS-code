class A{
    A(){
        System.err.println("Inside A constructor");
    }
}
class B extends A{
    B(){
        System.err.println("Inside B constructor");
    }
}
class C extends B{
    C(){
        System.err.println("Inside C constructor");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C c=new C();
    }
}
