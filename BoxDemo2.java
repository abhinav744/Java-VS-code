class Box{
    double width;
    double height;
    double depth;
}
class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1=new Box();
        Box myBox2=new Box();
        double vol;
        //assign value to box1
        myBox1.width=10;
        myBox1.height=20;
        myBox1.depth=15;
        //asign value to box2
        myBox2.width=3;
        myBox2.height=6;
        myBox2.depth=9;

        //compute for box1
        vol=myBox1.width*myBox1.height*myBox1.depth;
        System.out.println("Vol of Box1 is "+vol);

        //compute for box2
        vol=myBox2.width*myBox2.height*myBox2.depth;
        System.out.println("Vol of Box2 is "+vol);
    }
}
