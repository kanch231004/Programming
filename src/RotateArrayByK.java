public class RotateArrayByK {


    private int[] rotateArrayByK(int a[], int n , int k) {


        for (int i = n - k , l = 0 ; i < n ; i++, l++) {

            int temp = a[i];

            System.arraycopy(a, l, a, l + 1, i - l);
            a[l] = temp;

        }

        return a;

    }

    private int[] rotateArrayByKUsingRecursion(int k , int a[], int j) {

        if (k == 0)
            return a;

        else {
            int temp = a[a.length - k ];
            for (int i = (a.length - k  ) ; i > j; i--) {

                a[i] = a[i - 1];

            }
            a[j] = temp;
            j++;
            k--;
            return rotateArrayByKUsingRecursion(k, a, j);
        }

    }

    public static void main(String[] args) {

        RotateArrayByK rotateArrayByK = new RotateArrayByK();

        int a[] = { 3,7,3,1,0,5,7,9,2,4,9,4,2,0,4,8,7,5};


      //  a = rotateArrayByK.rotateArrayByK(a, 18, 6);                                              //  Simple rotation of array
        a = rotateArrayByK.rotateArrayByKUsingRecursion(3,a,0);                               //  Rotation using recursion

        for (int b : a) {

            System.out.println(b);
        }
    }
}
