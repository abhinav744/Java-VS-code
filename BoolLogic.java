/**
 * BoolLogic
 */
class BoolLogic {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c = a | b;  //t
        boolean d = a & b;  //f
        boolean e = a ^ b;  //t
        boolean f = (!a & b) | (a & !b);    //t
        boolean g = !a; //f
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" a|b = " + c);
        System.out.println(" a&b = " + d);
        System.out.println(" a^b = " + e);
        System.out.println("!a&b|a&!b = " + f);
        System.out.println(" !a = " + g);
        }
    }