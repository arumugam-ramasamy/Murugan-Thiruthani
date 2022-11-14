package com.kohls.demo.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Setter
@Getter
public class NumberTarget {

    public List<Integer> numbers;
    public int target;


}
