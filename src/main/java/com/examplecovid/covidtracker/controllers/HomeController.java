package com.examplecovid.covidtracker.controllers;

import com.examplecovid.covidtracker.Services.CoronavirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    CoronavirusDataService coronavirusDataService;
    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute("locationStats" , coronavirusDataService.getAllStats());
        return "index";
    }
}
