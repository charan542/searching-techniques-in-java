public class binarysearch{
    public static void main(String args[]){
        int a[]={1,2,3,7,9,11,23,45,67};
        int l,h,i,mid,flag=1,k;
        k=8;
        l=0;
        h=a.length-1;
        
        while(l<h){
            mid=(l+h)/2;
            if(a[mid]==k){
                flag=0;
                System.out.println(mid);
                break;
            }
            if(a[mid]<k){
                l=mid+1;
            }
            if(a[mid]>k){
                h=mid-1;
            }
        }
        if(flag==1){
            System.out.println("key not found");
        }
    }
}