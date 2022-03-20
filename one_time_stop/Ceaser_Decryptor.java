///////////////////////////////
//   Author: Zeyad Elnagar   //
//   ID:     189714          //
///////////////////////////////

import java.util.Scanner;

public class Ceaser_Decryptor {
    static final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final int alphaLen = alpha.length();
    static final String[] CommonWords = {"the","be","to","of","and","a","in","that","have","I","it","for","not","on","with","he","as","you","do","at","this","but","his","by","from","they","we","say","her","she","or","an","will","my","one","all","would","there","their","what","so","up","out","if","about","who","get","which","go","me","when","make","can","like","time","no","just","him","know","take","people","into","year","your","good","some","could","them","see","other","than","then","now","look","only","come","its","over","think","also","back","after","use","two","how","our","work","first","well","way","even","new","want","because","any","these","give","day","most","us"};
    
    public static void main(String[] args) {
        String encryptedMsg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decrypted message");
        encryptedMsg = sc.nextLine();
        encryptedMsg = encryptedMsg.toUpperCase();
        Auto_Decrypt(encryptedMsg);
    }

    public static void Auto_Decrypt(String input) {
        for (int shiftKey = 0; shiftKey < alphaLen; shiftKey++) {
            String deciphered = Decrypt(input, shiftKey);
            if (Evaluate(deciphered)) {
                System.out.println("Decrypted Message is " + deciphered + "\nThe Shift Key value is " + shiftKey);
            }
        }
    }

    public static String Decrypt(String input, int shift) {
        String decryptedMsg = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                int charIndex = alpha.indexOf(input.charAt(i));
                int charVal = (charIndex - shift) % 26;
                if (charVal < 0)
                    charVal += alphaLen;
                char newChar = alpha.charAt(charVal);
                decryptedMsg += newChar;
            } else {
                decryptedMsg += ' ';
            }
        }
        return decryptedMsg;
    }

    public static boolean Evaluate(String decipheredText) {
        String[] splittedTxt = decipheredText.split(" ");
        for (String split : splittedTxt) {
            for (String word : CommonWords) {
                if (split.equals(word.toUpperCase()))
                    return true;
            }
        }
        return false;
    }
}