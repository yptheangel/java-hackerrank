import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x1=sc.nextInt();
                String x=String.valueOf(x1);
               
                int alpha_num1=countAlphabet(s1);
                // int number_num1=countNumber(s1);
                // System.out.println("Lang:"+alpha_num1);
                // System.out.println("Num:"+number_num1);

                // int alpha_num2=countAlphabet(x);
                int number_num2=countNumber(x);
                // System.out.println(alpha_num2);
                // System.out.println("Num:"+number_num2);

                String PaddedString=addPaddingForString(s1,alpha_num1);
                String PaddedNumber=addPaddingForNumber(x,number_num2);
                System.out.println(PaddedString+PaddedNumber);
            }
            
            System.out.println("================================");
    }

        public static int countAlphabet(String x){
            char[] ch = x.toCharArray();
            int letter= 0;
            int num=0;
            for (int i=0;i<ch.length;i++){
                if(Character.isLetter(ch[i])){
                    letter++;
                }
            }
            return letter ;
        }
        public static int countNumber(String x){
            char[] ch = x.toCharArray();
            int letter= 0;
            int num=0;
            for (int i=0;i<ch.length;i++){
                if(Character.isDigit(ch[i])){
                    num++;
                }
            }
            return num;
        }

        public static String addPaddingForString(String x,int y){
            String myString = x;
            for (int i = 0;i<15-y;i++)
            {
                myString = myString+" ";
            }
            return myString;
        }
        public static String addPaddingForNumber(String x,int y){
            String myNumber = x;
            for (int i = 0;i<3-y;i++)
            {
                myNumber = "0"+myNumber;
            }
            return myNumber;
        }
}