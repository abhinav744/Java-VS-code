/**
 * demonstrate ++ IncDec
 */
class IncDec {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c,x,y,t,s;
        int d;
        c=++b;
        d=a++;
        c++;
        x=42;
        y=++x;
        t=42;
        s=t++;
        System.out.println("a = "+a);//(d=a so d=1)and(a=1+1 so a=2)
        System.out.println("b = "+b);//(b=2+1)
        System.out.println("c = "+c);//(c=4)
        System.out.println("d = "+d);//(d=1)
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("t = "+t);
        System.out.println("s = "+s);
    }
}