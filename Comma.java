//class Sample {
//  public static void main(String args[]) {
//     int a, b;
//     b = 4;
//     for(a=1; a<b; a++) {
//     System.out.println("a = " + a);
//     System.out.println("b = " + b);
//     b--;
//     }
//     }
//    }

/**
 * Comma
 */
class Comma {
    public static void main(String[] args) {
        int a,b;
        for(a=1,b=4;a<b;a++,b--){
            System.out.println("a = "+a);
            System.out.println("b = "+b);
        }
    }
}