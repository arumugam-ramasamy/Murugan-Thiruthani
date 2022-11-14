package com.kohls.demo.validate;

import java.util.List;

public class ValidateInput {

    public static boolean validateNonNullNumbers (List<Integer> arr) {
        if (arr == null) {
           return false ;
        }
        return true ;
    }

    public static boolean validateLength (List<Integer> arr) {
        if (arr != null && arr.size() < 2) {
            return false ;
        }
        return true ;
    }
}
