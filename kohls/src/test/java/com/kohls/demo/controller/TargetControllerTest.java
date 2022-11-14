package com.kohls.demo.controller;

import com.kohls.demo.model.NumberTarget;
import com.kohls.demo.service.TargetService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.List;

class TargetControllerTest {

    @InjectMocks
    TargetController targetController ;

    @Mock
    TargetService targetService ;

    public void init () {

    }

    public List<Integer> createList(int len) {
        if (len == -1) return null ;
        List<Integer> listNums = new ArrayList<>( );
        if (len == 0)return listNums ;
        listNums.add(1) ;
        if (len == 1) return listNums ;
        listNums.add(3) ;
        listNums.add(3) ;
        listNums.add(-1) ;
        listNums.add(4) ;
        listNums.add(2) ;
        return listNums ;
    }

    public NumberTarget simpleSuccessTest () {
        NumberTarget simpleTargetTest  = new NumberTarget()  ;
        simpleTargetTest.setNumbers(createList(2));
        simpleTargetTest.setTarget(6);
        return simpleTargetTest ;
    }

    public NumberTarget simpleFailureTest () {
        NumberTarget simpleTargetTest  = new NumberTarget()  ;
        simpleTargetTest.setNumbers(createList(2));
        simpleTargetTest.setTarget(100);
        return simpleTargetTest ;
    }

    public NumberTarget simpleNullExceptionTest () {
        NumberTarget simpleTargetTest  = new NumberTarget()  ;
        simpleTargetTest.setNumbers(createList(-1));
        simpleTargetTest.setTarget(100);
        return simpleTargetTest ;
    }

    public NumberTarget simpleInsuficientTest () {
        NumberTarget simpleTargetTest  = new NumberTarget()  ;
        simpleTargetTest.setNumbers(createList(1));
        simpleTargetTest.setTarget(100);
        return simpleTargetTest ;
    }

    @Test
    public void testSimpleSuccess () {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
       // request.set

    }

}