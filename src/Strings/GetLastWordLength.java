package Strings;

public class GetLastWordLength {

    public static void main(String[] args) {

        GetLastWordLength obj = new GetLastWordLength();
       // System.out.println(obj.getLastWordLength("check checks  "));
        StringBuilder stringBuilder =  new StringBuilder();
        stringBuilder.append("[{()}]");
        System.out.println(obj.isValidStringForBrackets(stringBuilder));

    }

    private int getLastWordLength(String s) {

        int i = s.length() -1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int count = 0 ;
        while (i >= 0 && s.charAt(i) != ' ' ) {

           count ++ ;
           i--;
        }

        return count ;
    }

    private boolean isValidStringForBrackets(StringBuilder s) {

        if (s.toString().isEmpty())
            return true ;


            for (int i = 0; i <= s.length() - 1; i++) {

                if (i >= 0) {
                char first = s.charAt(i);

                if (i < s.length() - 1) {

                    if (checkIfBalanced(first, s.charAt(i + 1))) {

                        s.delete(i, i + 2);
                        i--;
                        System.out.println("deleted " + s);

                    }
                }

            }
        }

        System.out.println(s.toString());

        return s.toString().isEmpty();

    }

    private boolean checkIfBalanced(char first, char second) {

        System.out.println("first "+first + " second "+second);

        switch (first) {

            case  '{' :  if (second == '}')
                            return  true ;
            break;


            case  '[' :  if (second == ']')
                            return true ;
            break;

            case '(' : if (second == ')')
                            return  true ;
            break;

            default: return false ;

        }

        return false;

    }
}
