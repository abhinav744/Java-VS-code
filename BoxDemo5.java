class Box{
    double width;
    double height;
    double depth; 

    void setDim(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
double volume(){
    return width*height*depth;
    }
}
/**
 * BoxDemo5
 */
class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1=new Box();
        Box myBox2=new Box();

        myBox1.setDim(10,20,15);
        myBox2.setDim(3,6,9);

        myBox1.volume();
        System.out.println("Vol is "+myBox1.volume());

        myBox2.volume();
        System.out.println("Vol is "+myBox2.volume());
    }    
}
