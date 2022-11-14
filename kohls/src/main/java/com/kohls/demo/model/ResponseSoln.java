package com.kohls.demo.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ResponseSoln {

    ArrayList<Integer> solution ;

    public ResponseSoln() {
        solution = new ArrayList<Integer>() ;
    }

}
