package Recursion;

public class FindPatternForN {

    public static void main(String[] args) {

        FindPatternForN patternForN = new FindPatternForN();
        System.out.println(patternForN.printPatternNoRecur(4));

    }

    //counter = 2, String = 11 ;
    private String printPatternNoRecur (int n) {

        String lastString ;

        StringBuilder resultSting = new StringBuilder();
        int counter = 1;
        lastString = "1" ;

        while ( counter <= n-1) {
            int count = 1 ;

            System.out.println("last "+lastString);
            resultSting.setLength(0);

            for (int i = 0 ; i <= lastString.length() -1 ; i++ ) {

                while (i+1 < lastString.length() && lastString.charAt(i) == lastString.charAt(i+1)) {
                    count++;
                    i++;

                }

                resultSting = resultSting.append(count).append(lastString.charAt(i));
                System.out.println("result "+resultSting);

        }

        lastString = resultSting.toString();

        counter ++;


        }


        return resultSting.toString() ;


    }

    //counter = 2, String = 11 ;
    private String printPattern (int n) {

        String lastString ;

        StringBuilder resultSting = new StringBuilder();

        if (n == 1)
            return "1";

        int count = 1 ;

         lastString = printPattern(n-1) ;


        System.out.println("last "+lastString);

        for (int i = 0 ; i <= lastString.length() -1 ; i++ ) {


            while (i+1 < lastString.length() && lastString.charAt(i) == lastString.charAt(i+1)) {
                count++;
                i++;

            }

            resultSting = resultSting.append(count).append(lastString.charAt(i));
            System.out.println("result "+resultSting);

        }

        return resultSting.toString() ;


    }
}
