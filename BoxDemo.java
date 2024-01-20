class Box{
    double height;
    double width;
    double depth;
}
/**
 * BoxDemo
 */
class BoxDemo {
    public static void main(String[] args) {
        Box myBox=new Box();
        double vol;
        //assign value in myBox
        myBox.height=10;
        myBox.width=20;
        myBox.depth=15;

        vol=myBox.height*myBox.width*myBox.depth;
        System.out.println("Vol is "+vol);
    }
}