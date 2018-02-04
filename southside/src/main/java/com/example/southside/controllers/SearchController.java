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

    private Activity activity = Activity.getInstance();


    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "Search Activities");
        //CHANGING THIS ON 2.3.18
        //model.addAttribute(new Activity());

        model.addAttribute(new SearchForm());
        return "search/search";
    }

    @RequestMapping(value="results")
    public String search(Model model, @ModelAttribute SearchForm searchForm) {
        ArrayList<Activity> activities;
   /*     if(searchForm.getSubject().equals("All")) {
            activities = activity.findAll();
        } else {   */
            activities = activity.findBySubject(searchForm.getSubject());

        model.addAttribute("activities", activities);
        return "search/search";

        }
    }

  //      return "search/index";
  //  }

 /*  TOOK THIS OUT TO TRY NEW STUFF 2.3.18

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

        }
        return "search/results";
    }

    /*
    USE THIS TO TAKE IN SEARCHFORM "subject" and get list
     @RequestMapping(value = "results")
    public String search(Model model,
                         @ModelAttribute SearchForm searchForm) {

        ArrayList<Job> jobs;

        if (searchForm.getSearchField().equals(JobFieldType.ALL)) {
            jobs = jobData.findByValue(searchForm.getKeyword());
        } else {
            jobs = jobData.findByColumnAndValue(searchForm.getSearchField(), searchForm.getKeyword());
        }

        model.addAttribute("jobs", jobs);

        return "search";
    }
     */


