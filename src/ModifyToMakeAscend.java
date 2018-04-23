import com.sun.xml.internal.xsom.impl.scd.Iterators;

public class ModifyToMakeAscend {


    public static void main(String[] args) {


        ModifyToMakeAscend obj = new ModifyToMakeAscend();
        int a[] = { 3,4,2,3} ;
        System.out.println(obj.isArrNonDecreasingModifyingOne(a));
    }


    private boolean modifyToMakeAscendingOrder(int a[]) {


        int flag = -1 ;
        int i ;
        for ( i =1 ; i < a.length -1 ; i ++) {

            if (!(a[i-1] <= a[i] && a[i] <= a[i+1])) {

                flag++ ;

            }

            if (flag == 0 &&  i != (a.length -2)) {

                if (!(a[i-1] <= a[i+1] && a[i+1] <= a[i+2])) {
                    flag++;

                }
                i++;
            }

            if (flag == 1) {

                return false;
            }

        }

        System.out.println("flag "+flag);
        return flag <= 0;

    }


    private boolean improvedMakeAscending(int[] a) {

        int count = 0 ;

        for (int i = 1 ; i <= a.length -1 ; i++) {


            if (count++ > 0)
                return false ;
            if ((a[i] < a[i-1])) {

                if ( i- 2 < 0 || a[i - 2] <= a[i] ) a[i - 1] = a[i];
                else {
                    a[i] = a[i-1];
                }

                count++;
            }

            System.out.println(count);

        }

        return true ;
    }

    public static boolean isArrNonDecreasingModifyingOne (int[] arr) {
        if (arr == null)
            return false;

        int modificationCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int previous = i > 0 ? arr[i-1] :Integer.MIN_VALUE;
            int next = i < arr.length - 1 ? arr[i+1] :Integer.MAX_VALUE;

            if(previous <= arr[i] && arr[i] <= next)
                continue;
            else if (modificationCount == 0) {
                modificationCount++;
                if(previous >  arr [i] && next < arr[i])
                    return false;

                if (next < arr [i]) {
                    int nextToNext = i < arr.length - 2 ? arr[i+2] :Integer.MAX_VALUE;
                    if(nextToNext >= next) {
                        if(next >= previous) {
                            arr[i] = next;
                        }
                        else if (arr[i] <= nextToNext){
                            arr[i+1] = arr[i];
                        }
                        else
                            return false;
                    }
                    else
                        return false;
                }
            }
            else {
                return false;
            }
        }

        return true;
    }

}
