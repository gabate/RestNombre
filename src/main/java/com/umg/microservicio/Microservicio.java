/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.microservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @author mmendez
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Microservicio {

    public static void main(String[] args) {
        SpringApplication.run(Microservicio.class, args);
    }
}
