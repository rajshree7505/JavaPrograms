public class rverseofarray {

    static void reverse(int arr[],int n)
    {
        int i=0,j=n-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr)
        {
            System.out.print(ele+ ",");
        }



    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        reverse(arr, n);
    }
}