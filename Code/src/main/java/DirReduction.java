import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        // Your code here.
        ArrayList<String[]> list = new ArrayList<String[]>();
        int n=0,s=0,w=0,e=0,ans_ns=0,ans_we=0;
        String result = "";
        for (String next: arr
             ) {
            if(next == "NORTH"){
                if(s != 0){
                    s -= 1;
                }
                else{
                    n += 1;
                }

            }
            else if(next == "SOUTH"){
                if(n != 0){
                    n -= 1;
                }
                else{
                    s += 1;
                }
            }
            else if(next == "WEST"){
                if(e != 0){
                    e -= 1;
                }
                else {
                    w += 1;
                }

            }
            else if(next == "EAST"){
                if(w != 0){
                    w -= 1;
                }
                else {
                    e += 1;
                }
            }
        }
        if (n > 0){
            list.add("NORTH");
        }
        else if( s > 0){
            list.add("SOUTH");
        }
        else if(w > 0){
            list.add("WEST");
        }
        else if(e > 0){
            list.add("EAST");
        }
        else{
            return new String[] {};
        }
        return list;

    }


}
