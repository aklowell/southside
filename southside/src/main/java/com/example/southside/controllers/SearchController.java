package com.example.southside.controllers;


import com.example.southside.models.Activity;
import com.example.southside.models.data.ActivityDao;
import com.example.southside.models.forms.SearchForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("search")
public class SearchController {

    @Autowired
    private ActivityDao activityDao;


    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "Search Activities");
        model.addAttribute(new Activity());

        return "search/index";
    }

    @RequestMapping(value = "results")
    public String processSearchForm(Model model, String search1) {
        List<Activity> all = new ArrayList<>();
        Activity one = new Activity();
        model.addAttribute("activities", activityDao.findAll());
   /*     for (Activity one : all) {
            if (one.geteSubject().equalsIgnoreCase("Literacy")) {
                activities.add(one);
                model.addAttribute(activities);
            }

        }*/
        return "search/results";
    }

}