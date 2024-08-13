public class Recursion_2
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        System.out.println(binary_search(a,0,2,4));
    }
    static int binary_search(int a[],int start,int end,int k){
        int mid=start+(end-start)/2;
        if(a[mid]==k){
            return mid;
        }
        if(a[mid]<a[k]){
            return binary_search(a,mid+1, end, k);
        }
        return binary_search(a, start, mid-1, k);
    }

}
