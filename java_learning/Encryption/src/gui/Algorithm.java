package gui;

public class Algorithm {
    public String performEncryption(String input, int key){
        String dictionary = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();
        int n = dictionary.length();
        for (int i = 0; i < input.length(); i++) {
            int index = dictionary.indexOf(input.charAt(i));
            if (dictionary.indexOf(input.charAt(i)) != -1) {
                if (index+key <= n-1){
                    result.append(dictionary.charAt(index+key));
                }else{
                    for (int pos = index, j=0; j <= (n+key)-1; pos++,j++){
                        if (j == (n+key)-1){
                            result.append(dictionary.charAt(pos));
                            break;
                        }
                        if (pos == n-1) pos = 0;
                    }
                }

            }else {
                result.append(input.charAt(i));
            }
        }
        return String.valueOf(result);
    }
    public String performDecryption(String input){

        return input;
    }
}
