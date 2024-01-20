/**
 * Average an array of values
 */
class Average {
    public static void main(String[] args) {
        double nums[]={10.1,11.2,12.3,13.4,14.5};
        double result=0;
        int i;
        for(i=0;i<5;i++)
        result=result+nums[i];
      //result=0+10.1
      //result=10.1+11.2
      //result=21.3+12.3
      //result=33.6+13.4
      //result=47+14.5
        System.out.println("Average is "+result/5);
    }
}