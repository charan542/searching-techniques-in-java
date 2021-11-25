public class searchkey{
    public static void main(String args[]){
        int a[]={10,2,3,6,12,3,4,56};
        //find 14
        int b=4,i;
        for(i=0;i<a.length;i++){
            if(a[i]==b){
                break;

            }
        }
        System.out.print(i);

    }
}