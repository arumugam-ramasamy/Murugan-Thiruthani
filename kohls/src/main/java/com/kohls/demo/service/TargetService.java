package com.kohls.demo.service;

import com.kohls.demo.exception.InSufficeintDataException;
import com.kohls.demo.exception.NotFoundException;
import com.kohls.demo.model.NumberTarget;
import com.kohls.demo.model.ResponseSoln;
import org.springframework.stereotype.Service;

@Service
public interface TargetService {
    // Mock service
    public ResponseSoln getIndices(NumberTarget numberTarget)  throws NotFoundException, InSufficeintDataException;

}
