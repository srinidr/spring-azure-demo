/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sitec.salesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author srini
 */
@Controller
public class Demo {
    
    @Autowired
    JdbcTemplate jd;
    
    
    @RequestMapping("/")
    @ResponseBody  public String hello(){
        jd.query("select * from cust", (rs, rowNum) -> {
            System.out.println(rs.getString("name"));
            return  null;
                   
        });
        return "Hi Srini";
    }
    
}
