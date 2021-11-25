public class counting{
    public static void main(String args[]){
        int a[]={1,23,1,2,34,56,50};
        int s=1;
        int b,n,d=0;
        for(n=0;n<a.length;n++){
            if(a[n]==s){
                d=d+1;
            }
        }
        System.out.println(d);
    }
}