package com.kohls.demo.service;

import com.kohls.demo.constants.ExceptionMessages;
import com.kohls.demo.exception.InSufficeintDataException;
import com.kohls.demo.exception.NotFoundException;
import com.kohls.demo.model.NumberTarget;
import com.kohls.demo.model.ResponseSoln;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TargetServiceImpl implements TargetService {
    Logger logger = LoggerFactory.getLogger(TargetServiceImpl.class) ;
    public ResponseSoln getIndices(NumberTarget numberTarget)  throws NotFoundException, InSufficeintDataException {
        List<Integer> arr = numberTarget.getNumbers() ;
        int target = numberTarget.getTarget() ;
        ResponseSoln res = new ResponseSoln() ;
        Map<Integer, Integer> elementMap = new HashMap<Integer, Integer>() ;
        for (int i = 0 ; i < arr.size() ; i++) {
            int key = arr.get(i) ;
            if (elementMap.containsKey(target - key) == true) {
                if (key != (target - key)) {
                    res.getSolution().add(elementMap.get(target - key));
                    res.getSolution().add(i) ;
                    return res ;
                }

            }
            else {
                elementMap.put(key, i) ;
            }
        }
        logger.warn(ExceptionMessages.SOLUTIONNOTFOUND);
        throw new NotFoundException(ExceptionMessages.SOLUTIONNOTFOUND) ;
    }
}
