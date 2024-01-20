class Box{
    double width;
    double height;
    double depth;

    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    double volume(){
        return width*height*depth;
    }
}
/**
 * BoxDemo7
 */
class BoxDemo7 {
    public static void main(String[] args) {
        Box myBox1=new Box(10,20,15);
        Box myBox2=new Box(3,6,9);

        myBox1.volume();
        System.out.println("Vol is "+myBox1.volume());

        myBox2.volume();
        System.out.println(("Vol is "+myBox2.volume()));
    }
}