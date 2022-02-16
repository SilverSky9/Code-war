import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Conversion {
    Map<Integer, String> RomanNumber = new HashMap<>();
    public String solution(int n) {
       String result = "";
       while (n != 0) {
           if (n % 1000 != n) {
               result += RomanNumber.get(n - (n % 1000));
               n -= n - (n % 1000);
           } else if (n % 100 != n) {
               result += RomanNumber.get(n - (n % 100));
               n -= n - (n % 100);
           } else if (n % 10 != n) {
               result += RomanNumber.get(n - (n % 10));
               n -= n -(n % 10);
           } else {
               result += RomanNumber.get(n);
               n -= n;
           }
       }
        return result;
    }
    public Conversion(){
        RomanNumber.put(1,"I");
        RomanNumber.put(2,"II");
        RomanNumber.put(3,"III");
        RomanNumber.put(4, "IV");
        RomanNumber.put(5, "V");
        RomanNumber.put(6, "VI");
        RomanNumber.put(7, "VII");
        RomanNumber.put(8, "VIII");
        RomanNumber.put(9, "IX");
        RomanNumber.put(10, "X");
        RomanNumber.put(20, "XX");
        RomanNumber.put(30, "XXX");
        RomanNumber.put(40, "XL");
        RomanNumber.put(50, "L");
        RomanNumber.put(60, "LX");
        RomanNumber.put(70, "LXX");
        RomanNumber.put(80, "LXXX");
        RomanNumber.put(90, "XC");
        RomanNumber.put(100, "C");
        RomanNumber.put(200, "CC");
        RomanNumber.put(300, "CCC");
        RomanNumber.put(400, "CD");
        RomanNumber.put(500, "D");
        RomanNumber.put(600, "DC");
        RomanNumber.put(700, "DCC");
        RomanNumber.put(800, "DCCC");
        RomanNumber.put(900, "CM");
        RomanNumber.put(1000, "M");
        RomanNumber.put(2000, "MM");
        RomanNumber.put(3000, "MMM");
    }

}
