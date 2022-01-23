public class Maskify {
    public static String maskify(String str) {
        String ans="";
        if(str.length() <= 4){
            return str;
        }
        else{
            String last_4 = str.substring(str.length() - 4);
            int len_string = str.length() - 4;
            for (int i = 0; i < len_string; i++) {
                System.out.println(i);
            }
            return ans + last_4;
        }



    }
    public String name(){
        return "Golf";
    }
}
