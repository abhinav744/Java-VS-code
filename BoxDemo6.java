class Box{
    double width;
    double height;
    double depth;

    Box(){
        System.out.println("Contructing Box");
        width=10;
        height=10;
        depth=10;
    }

    double volume(){
        return width*height*depth;
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        Box myBox1=new Box();
        Box myBox2=new Box();

        myBox1.volume();
        System.out.println("Vol is "+myBox1.volume());

        myBox2.volume();
        System.out.println("Vol is "+myBox2.volume());
    }
}
