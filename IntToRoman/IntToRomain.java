package IntToRoman;

public class IntToRomain {
    public static String roman= "";
    public static String intToRoman(int num) {

        while(num!=0 && num > 0){
            if(num >= 1000){
                num = num - 1000;
                roman = roman + "M";
              
            }
            else if(num >= 500 && num < 1000){
                num = num - 500;
                roman = roman +"D";
               
            }
            else if(num >= 100 && num < 500){
                num = num - 100;
                roman = roman + "C";
             
            }
            else if(num >= 50 && num < 100){
                num = num - 50;
                roman = roman + "L";
              
            }
            else if(num >= 10 && num < 50){
                num = num - 10;
                roman = roman + "X";
                
            }
            else if(num >= 5 && num < 10){
                num = num - 5;
            
            }
            else{
                num = num - 1;
                roman = roman + "I";
           
            }
        }
        return roman;
    }
    public static void main(String[] args) {
        System.out.println("Converting 1124 to Roman = "+intToRoman(1124));
        System.out.println("Converting 500 to Roman = "+intToRoman(500));
        System.out.println("Converting 1206 to Roman = "+intToRoman(1206));
        System.out.println("Converting 3999 to Roman = "+intToRoman(3999));

    }
}
