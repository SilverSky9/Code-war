public class Conversion {
    public String solution(int n) {
        String result = "";
        while (n != 0){
            if((n % 1000 == 0 || (n + 1) % 1000 == 0 || (n - 1) % 1000 == 0) && n - 1 != 0){
                if((n + 1) % 100 == 0){
                    n -= 1000;
                    return result += "DM";
                }
                if((n - 1) % 100 == 0){
                    n -= 1000;
                    return result += "MD";
                }
                result += "M";
                n -= 1000;
            }
            else if ((n % 500 == 0 || (n + 1) % 500 == 0 || (n - 1) % 500 == 0) && n - 1 != 0){
                if((n + 1) % 500 == 0){
                    n -= 500;
                    return result += "CD";
                }
                if((n - 1) % 500 == 0){
                    n -= 500;
                    return result += "DC";
                }
                result += "D";
                n -= 500;
            }
            else if ((n % 100 == 0 || (n + 1) % 100 == 0 || (n - 1) % 100 == 0) && n - 1 != 0){
                if((n + 1) % 100 == 0){
                    n -= 100;
                    return result += "LC";
                }
                if((n - 1) % 100 == 0){
                    n -= 100;
                    return result += "CL";
                }
                result += "C";
                n -= 100;
            }
            else if((n % 50 == 0 || (n + 1) % 50 == 0 || (n - 1) % 50 == 0) && n - 1 != 0){
                if((n + 1) % 50 == 0){
                    n -= 50;
                    return result += "XL";
                }
                if((n - 1) % 50 == 0){
                    n -= 50;
                    return result += "LX";
                }
                result += "L";
                n -= 50;
            }
            else if((n % 10 == 0 || (n + 1) % 10 == 0 || (n - 1) % 10 == 0) && n - 1 != 0){
                if((n + 1) % 10 == 0){
                    n -= 5;
                    return result += "VX";
                }
                if((n - 1) % 10 == 0){
                    n -= 5;
                    return result += "XV";
                }
                result += "X";
                n -= 10;
            }
            else if((n % 5 == 0 || (n + 1) % 5 == 0 || (n - 1) % 5 == 0) && n - 1 != 0){
                if((n + 1) % 5 == 0){
                    n -= 5;
                    return result += "IV";
                }
                if((n - 1) % 5 == 0){
                    n -= 5;
                    return result += "VI";
                }
                result += "V";
                n -= 5;
            }
            else if (n % 1 == 0){
                result += "I";
                n -= 1;
            }

        }
        return result;
    }

}
