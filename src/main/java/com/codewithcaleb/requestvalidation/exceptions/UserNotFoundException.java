package com.codewithcaleb.requestvalidation.exceptions;


//Remember how we create Custom Exception classes
//They Inherit from the Custom Exception Class
public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message) {
        super(message);
    }
}
