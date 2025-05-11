import java.util.Arrays;

class PlusoneLeetcode {
    public int[] plusOne(int[] digits) {
        for(int i =digits.length -1; i >=0; i--){// starting array from reverse to handle 9's situation betterly
           if(digits[i] == 9){
             digits[i] = 0;  // if i is 9 it will changed to 0
           }else{
            digits[i]++;  // in case i isn't 9, w'll increase to +1
            return digits;
           }
        }
        digits = new int[digits.length +1]; // size of new array will be +1 bcz 9 wll change to 10
        digits[0] = 1;
        return digits; 
    }
}
