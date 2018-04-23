public class RemoveDuplicateFromArray {


    private void returnLength(int[] a) {


        int k = 0;
        int i ;

        for ( i = 0 ; i < a.length -1 ; i++) {

            if (a[i] != a[i+1]) {

                a[k++] = a[i];
            }

        }

        /*for (  i = 0 ; i < a.length -1 ; i++)
            if (a[i] != a[i+1])
                a[k++] = a[i];*/

      /*  a[k] = a[i] ;

        for ( int j = 0 ; j <= k ; j++) {

            System.out.println(a[j]);
        }*/

        System.out.println("length is "+(k+1));


    }

    private void findMedianOfArray() {


    }



    public static void main(String[] args) {

        RemoveDuplicateFromArray obj = new RemoveDuplicateFromArray();

        int[] a = { 3,6,8,9,9,9,12,14,14,14,17,20,22,22,22,22,22,30,36,39,39,40,40};

         obj.returnLength(a);


    }
}
