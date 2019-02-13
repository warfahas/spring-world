package org.launchcode.springworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mkabd on 2/12/2019.
 */
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Welcome";
    }

}
