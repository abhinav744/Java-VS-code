class Ra1 {
    public static void main(String[] args) {
        int n=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
