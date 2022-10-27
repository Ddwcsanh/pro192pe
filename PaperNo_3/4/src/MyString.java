/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MyString implements IString {

    //return and count prime number in string
    @Override
    public int f1(String str) {
        int count = 0;
        String[] s = str.split("\\s");
        for (int i = 0; i < s.length; i++) {
            char[] a = s[i].toCharArray();
            for (int j = 0; j < a.length; j++) {
                if (Character.isDigit(a[j])) {
                    if (checkPrime(a[j])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public boolean checkPrime(char c) {
        int a = Character.getNumericValue(c);
        for (int i = 2; (i*i) <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    //reverse string
    @Override
    public String f2(String str) {
        String output = "";
        String[] s = str.split("\\s");
        for (int i = (s.length - 1); i >= 0; i--) {
            output += s[i] + " ";
        }
        return output.trim();
    }

}
