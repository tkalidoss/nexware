package com.poc.nexware.util;

import com.poc.nexware.entity.Palindrome;

public class Validation {

   public static boolean isValid(Palindrome palindrome) throws PalindromeException, MaxLengthException {

        boolean valid = false;
        String obj = palindrome.getList();
        if(obj.length() > 0){
            obj = obj.trim();
            if(isPalindrome(obj) && obj.length() <=100)
                valid = true;
            else
                throw new MaxLengthException("The Given String Length Is Greater Than 100");
        }
        return valid;
    }

    static boolean isPalindrome(String obj) throws PalindromeException{
        boolean isValid = false;
        StringBuffer r = new StringBuffer();
        for(int i = obj.length() - 1; i >= 0; i--) {
            r.append(obj.charAt(i));
        }
        if(r.toString().equals(obj))
            isValid = true;
        else
            throw new PalindromeException("The Given String Is Not Palindrome");
        return isValid;
    }
}
