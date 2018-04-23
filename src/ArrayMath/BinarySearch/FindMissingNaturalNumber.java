package ArrayMath.BinarySearch;

public class FindMissingNaturalNumber {


    public static void main(String[] args) {

        int a[] = {1,2,3, 4,5,6,7,9,10,11};

      //  System.out.println(findMissingNumber(a));
        System.out.println(findMissingNumber(a));

    }

    public static int findMissingNumber(int a[]) {

        int low = 0;
        int up  =  a.length -1;
        while (low <= up) {

            int mid = (low +up)/2 ;
            if (a[mid] == mid +2 )
                return mid+1 ;
            else if (a[mid] > mid+1)
                up = mid;
            else low = mid ;

            }

        return -1 ;
    }


    public static int findMissingNumberInSeq(int[] arr, int start, int end) {
        if (start > end)
            return -1;
        int median = (start + end)/2;

        if (arr[median] == median + 1) {
            return findMissingNumberInSeq(arr,median +1,end);
        }
        else if (median > 0 && arr[median -1] == median + 1)  {
            return findMissingNumberInSeq(arr,start,median-1);
        }
        else {
            return median + 1;
        }
    }

}
