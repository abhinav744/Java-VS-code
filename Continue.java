class Continue{
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
            if(i%2==0)continue;
            System.out.println(" ");
        }
    }
}
// 0    0
// // 1    1
// 2    0
// // 3    1
// 4    0    
// // 5    1
// 6    0
// // 7    1
// 8    0
// // 9    1
