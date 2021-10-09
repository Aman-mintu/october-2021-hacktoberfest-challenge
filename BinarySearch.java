// Binary Search

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66,77,88,99};
        int target=77;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>target)   // from the left side of the middle element
            {
                end=mid-1;
            }
            else if(arr[mid]<target) //from the right side of the middle element
            {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
