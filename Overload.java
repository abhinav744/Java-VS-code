class OverloadDemo{
    void test(){
        System.out.println("No parameter");
    }
    //Overload test for 1 inetger
    void test(int a){
        System.out.println("a: "+a);
    }
    //Overload test for 2 integer
    void test(int a,int b){
        System.out.println("a and b: "+a+" "+b);
    }
    //Overload test for double 
    double test(double a){
        System.out.println("a: "+a);
        return a*a;
    }
}

/**
 * Overload
 */
class Overload {
    public static void main(String[] args) {
        OverloadDemo ob=new OverloadDemo();
        double result;
        //call all version of test
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result=ob.test(10.15);
        System.out.println("Result of 10.15: "+result);
    }
}