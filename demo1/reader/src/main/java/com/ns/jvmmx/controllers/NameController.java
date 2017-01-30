package com.ns.jvmmx.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by apimentel on 1/29/17.
 */
@Controller
@RequestMapping("app")
@RefreshScope
public class NameController {
    @Value("${app.label: default}")
    String name;

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    @ResponseBody String getName() {
        return name;
    }
}
