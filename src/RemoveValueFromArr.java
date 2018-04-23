public class RemoveValueFromArr {

    public static void main(String[] args) {


        RemoveValueFromArr removeValueFromArr = new RemoveValueFromArr();
        int a[] = { 3,4,6,2,3};

        int newLength = removeValueFromArr.returnLength(a, 3);
        System.out.println("new Length is "+newLength);
    }


    private int returnLength(int a[], int value) {
        int j = a.length -1;
        int index = 0;
        for ( int i =0 ; i <= j ; i++ ) {

            if (a[i] != value) {

                /*int l = i;

                while (l < j) {

                    a[l] = a[l+1];
                    l++;

                }

                a[j] = value;

                i-- ; j--;*/
                a[index++] = a[i];
            }
        }

        for ( int i = 0 ; i <= a.length -1; i++) {

            System.out.println(a[i]);
        }

        return index;
    }
}
