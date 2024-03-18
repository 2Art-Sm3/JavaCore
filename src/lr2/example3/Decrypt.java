package lr2.example3;

public class Decrypt {

    static String getDecryptString(String input, int key){

        char[] chars = input.toCharArray();

        int[] ints = new int[chars.length];

        for(int i = 0 ; i < chars.length ; i++){
            ints[i] = chars[i] - key;

            chars[i] = (char) ints[i];
        }
        String decryptString = new String(chars);

        return decryptString;
    }
}
