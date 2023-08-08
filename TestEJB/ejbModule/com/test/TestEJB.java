package com.test;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


@Stateless
@LocalBean
public class TestEJB {

    /**
     * Default constructor. 
     */
    public TestEJB() {
    }
    
    public String returnDate() {
    	return "\n the date is : " + java.time.LocalDate.now();
    }

}
