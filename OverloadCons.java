class Box{
    double width;
    double height;
    double depth;

    //constructor used when all dimension specified
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    //constructor used when no dimension specified
    Box(){
        width=-1;   //use -1 to indicate an uninitialized box
        height=-1;
        depth=-1;
    }
    //constructor used when cube is created
    Box(double len){
        width=height=depth=len;
    }
    //compute and return and value
    double volume(){
        return width*height*depth;
    }
}

class OverloadCons {
    public static void main(String[] args) {
        //create boxes using various constructor
        Box myBox1=new Box(10,20,15);
        Box myBox2=new Box();
        Box mycube=new Box(7);

        //get volume of first box
        myBox1.volume();
        System.out.println("Vol of mybox1 is "+myBox1.volume());
        myBox2.volume();
        System.out.println("Vol of mybox2 is "+myBox2.volume());
        mycube.volume();
        System.out.println("Vol of mycube is "+mycube.volume());

    }
}
