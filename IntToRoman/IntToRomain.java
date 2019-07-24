package IntToRoman;

public class IntToRomain {
    public static String intToRoman(int num) {
        String romanNum = "";
        int[] intArr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romanArr = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        for (int i = intArr.length - 1; i >= 0; i--) {
            while (num / intArr[i] > 0) {
                num = num - intArr[i];
                romanNum += romanArr[i];
            }
        }
        return romanNum;
    }
    public static void main(String[] args) {
        System.out.println("Converting 1124 to Roman = "+intToRoman(1124));
        System.out.println("Converting 500 to Roman = "+intToRoman(500));
        System.out.println("Converting 1206 to Roman = "+intToRoman(1206));
        System.out.println("Converting 3999 to Roman = "+intToRoman(3999));

    }
}
