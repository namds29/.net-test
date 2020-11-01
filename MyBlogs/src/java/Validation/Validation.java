/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

/**
 *
 * @author ASUS
 */
public class Validation {

    public boolean checkPhone(String txt) {
        if (txt.length() >= 9 && txt.length() <= 11) {
            for (int i = 0; i < txt.length(); i++) {
                if(!Character.isDigit(txt.charAt(i))){
                    return false;
                }
            }
            return true;

        }else{
            return false;
        }
        
    }
}
