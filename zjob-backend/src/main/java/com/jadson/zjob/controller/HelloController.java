package com.jadson.zjob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jadson.zjob.dao.mapper.ZJobUserMapper;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private ZJobUserMapper zJobUserMapper;

    @GetMapping
    public String hello() {
        return zJobUserMapper.selectAll().toString();
    }
}
