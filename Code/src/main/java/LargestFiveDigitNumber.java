import java.util.ArrayList;

public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        ArrayList<String> list = new ArrayList<String>();
        int max_number = 0;
        //If string number length less 5 character return it : because it's one number largest
        if(digits.length() <= 5){
            //Parse String to int and return it
            return Integer.parseInt(digits);
        }
        //Else string number length more than 5 character
        else{
            //Foreach i to length digit's  string to
            for (int i = 0; i <= digits.length(); ++i) {
                /* Before substring check
                    1. digit's length - now index i must more than 5
                        : because if substring function + i will exception StringOutOfBound
                */
                if(digits.length() - i >= 5){
                    // Get substring(now i index's , index 5 for new)
                    String select = (digits.substring(i, 5+i));
                    // Add it to list
                    list.add(select);
                }
            }
            // foreach ArrayList to number items
            for (String number:
                 list) {
                // find max_value between old max value and new number
                max_number = Math.max(max_number, Integer.parseInt(number));
            }
            // when finish process return 5 character max value
            return max_number;
        }

    }
    public String simpleTest(){
        return "Test";
    }
}
