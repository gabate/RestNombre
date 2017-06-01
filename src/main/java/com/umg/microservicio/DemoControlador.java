/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.microservicio;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mmendez
 */
@RestController
public class DemoControlador {

    
    
    @RequestMapping(
            
            value = "umg/{num1}/{num2}", 
            method = RequestMethod.GET, 
            produces = "application/json")
    public String getCadenaJSON(@PathVariable int num1, @PathVariable int num2 ) {
        int suma = num1 + num2;
        String cadena = "{\"suma from suma2\":\"" + suma + "\"}";
        return cadena;
    }
}
