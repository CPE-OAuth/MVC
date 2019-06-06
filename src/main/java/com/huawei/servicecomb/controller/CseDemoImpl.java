package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-06-06T11:38:54.132Z")

@RestSchema(schemaId = "cseDemo")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class CseDemoImpl {

    @Autowired
    private CseDemoDelegate userCseDemoDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCseDemoDelegate.helloworld(name);
    }

}
