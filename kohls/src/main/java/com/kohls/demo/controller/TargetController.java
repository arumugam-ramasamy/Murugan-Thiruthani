package com.kohls.demo.controller;

import com.kohls.demo.constants.ExceptionMessages;
import com.kohls.demo.exception.InSufficeintDataException;
import com.kohls.demo.exception.NullDataException;
import com.kohls.demo.model.NumberTarget;
import com.kohls.demo.model.ResponseSoln;
import com.kohls.demo.service.TargetService;
import com.kohls.demo.validate.ValidateInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TargetController {

    Logger logger = LoggerFactory.getLogger(TargetController.class) ;

    @Autowired
    private TargetService targetService ;


    @PostMapping("/api/target")
    public ResponseSoln target(@RequestBody NumberTarget numberTarget) throws  InSufficeintDataException, NullDataException {
        if (ValidateInput.validateNonNullNumbers(numberTarget.getNumbers()) == false) {
            logger.error(ExceptionMessages.NULLDATAMESSAGE);
            throw new NullDataException(ExceptionMessages.NULLDATAMESSAGE) ;
        }
        if (ValidateInput.validateLength(numberTarget.getNumbers()) == false) {
            logger.error(ExceptionMessages.INSUFFICIENTDATA);
            throw new InSufficeintDataException(ExceptionMessages.INSUFFICIENTDATA) ;
        }
        return (targetService.getIndices(numberTarget));
    }

}
