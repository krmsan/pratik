package Practice_ders5;

public class Q03_s {
    /*
     * Interview questions…
     *
     * write a return method to reverse number
     *
     * Input : 12345 Output : 54321
     */

    public static void main(String[] args) {
        tersYaz();
        System.out.println(reverseNumber(12345));
    }

    public static void tersYaz() {
        int input = 1234567;
        String inputString = "";
        inputString += input;

        String inputTersi = "";

        for (int i = inputString.length()-1; i >=0; i--) {

            inputTersi += inputString.charAt(i);
        }
        System.out.println(inputTersi);

    }
    public static int reverseNumber(int input) {
        int reverseNum = 0;

        while(input>0){

            reverseNum = input%10 + reverseNum*10;  //cok guzel  12 1 +20 gibi  21   3+120  123
            input = input/10;
        }
        return reverseNum;
    }
}
