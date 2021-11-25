public class chekduplicates{
    public static void main(String args[]){
        int a[]={12,34,3,4,5,2};
        int i,j,flag=0;
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    flag=1;
                    System.out.print(true);
                    break;
                }
            }
        }
        if(flag==0){
            System.out.print(false);
        }

    }
}