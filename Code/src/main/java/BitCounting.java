public class BitCounting {
    public static int countBits(int n){
        // Show me the code!
        // Transform int to binary string
        String binaryString = Integer.toBinaryString(n);
        //Use chars() function to use int stream for filter and count string
        long ans = binaryString.chars().filter(ch -> ch == '1').count();

        return (int) ans;
    }
}
