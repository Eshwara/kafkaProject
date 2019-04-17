package com.taget.sample.controller;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/sample")
public class SampleController {


    @RequestMapping(value = "/subject/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAllSubjects(@PathVariable("id") String id){

        JSONObject json = new JSONObject();
        json.put("id",id);
        json.put("subject", "Java");
        json.put("version", "1.8");

        return new ResponseEntity<String>(json.toString(), HttpStatus.OK);
    }
}
