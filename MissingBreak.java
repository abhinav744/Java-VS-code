// /**
//  * MissingBreak
//  */
// class MissingBreak {
//     public static void main(String[] args) {
//         boolean done = false;
//         for(int i=1; !done; ++i) { //int i=1; !done;
//             System.out.println("i = " + i);
//             if(!done) done = true;
//             System.out.println("Second i = " + i);
//         }       //++i



//         for(int i=0;i<12;i++){
//             switch(i){
//                 case 0: System.out.println("Executing 0 block");
//                 case 1: System.out.println("Executing 1 block");
//                 case 2: System.out.println("Executing 2 block");
//                 case 3: System.out.println("Executing 3 block");
//                 case 4: System.out.println("is is less than 5");
//                 break;
//                 case 5:
//                 case 6:
//                 case 7:
//                 case 8:
//                 case 9:
//                 System.out.println("i is less than 10");
//                 break;
//                 default:
//                 System.out.println("x is more than 10");
//             }
//         }
//     }
// }

/* Here, Box uses a parameterized constructor to
 initialize the dimensions of a box.
*/
class Box {
 double width;
 double height;
 double depth;
 // This is the constructor for Box.
 Box(double w, double h, double d) {
 width = w;
 height = h;
 depth = d;
 }

 Box() {

 }
 // compute and return volume
 double volume() {
 return width * height * depth;
 }
}
class BoxDemo7 {
 public static void main(String args[]) {
 // declare, allocate, and initialize Box objects
 Box mybox1 = new Box(10, 20, 15);
 Box mybox2 = new Box(3, 6, 9);
 Box myBox3 = new Box();
 double vol;
 // get volume of first box
 vol = mybox1.volume();
 System.out.println("Volume is " + vol);
 // get volume of second box
 vol = mybox2.volume();
 System.out.println("Volume is " + vol);
 }
}