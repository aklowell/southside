package com.example.southside.models;


import com.example.southside.models.data.ActivityDao;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Activity {

    @Id
    @GeneratedValue
    private int id;

    private String eName;

    private String sName;

    private String eDescription;

    private String sDescription;

    private String eWhere;

    private String sWhere;

    private String eSubject;

    private String sSubject;

    private String eAges;

    private String sAges;

    private Date dateCreated;

    private String linkInfo;

    private String linkPhoto;

    private String linkVideo;


    //TODO should skill be enum or class, to put in a list?
    private String eSkill;

    private String sSkill;

    private String teacher;

    private String eMaterials;

    private String sMaterials;

    private String eRelevance;

    private String sRelevance;

    public Activity() {
    }

    public Activity(String eName, String sName, String eSubject, String sSubject) {
        this.eName = eName;
        this.sName = sName;
        this.eSubject = eSubject;
        this.sSubject = sSubject;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String geteDescription() {
        return eDescription;
    }

    public void seteDescription(String eDescription) {
        this.eDescription = eDescription;
    }

    public String getsDescription() {
        return sDescription;
    }

    public void setsDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    public String geteWhere() {
        return eWhere;
    }

    public void seteWhere(String eWhere) {
        this.eWhere = eWhere;
    }

    public String getsWhere() {
        return sWhere;
    }

    public void setsWhere(String sWhere) {
        this.sWhere = sWhere;
    }

    public String geteSubject() {
        return eSubject;
    }

    public void seteSubject(String eSubject) {
        this.eSubject = eSubject;
    }

    public String getsSubject() {
        return sSubject;
    }

    public void setsSubject(String sSubject) {
        this.sSubject = sSubject;
    }

    public String geteAges() {
        return eAges;
    }

    public void seteAges(String eAges) {
        this.eAges = eAges;
    }

    public String getsAges() {
        return sAges;
    }

    public void setsAges(String sAges) {
        this.sAges = sAges;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getLinkInfo() {
        return linkInfo;
    }

    public void setLinkInfo(String linkInfo) {
        this.linkInfo = linkInfo;
    }

    public String getLinkPhoto() {
        return linkPhoto;
    }

    public void setLinkPhoto(String linkPhoto) {
        this.linkPhoto = linkPhoto;
    }

    public String getLinkVideo() {
        return linkVideo;
    }

    public void setLinkVideo(String linkVideo) {
        this.linkVideo = linkVideo;
    }

    public String geteSkill() {
        return eSkill;
    }

    public void seteSkill(String eSkill) {
        this.eSkill = eSkill;
    }

    public String getsSkill() {
        return sSkill;
    }

    public void setsSkill(String sSkill) {
        this.sSkill = sSkill;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String geteMaterials() {
        return eMaterials;
    }

    public void seteMaterials(String eMaterials) {
        this.eMaterials = eMaterials;
    }

    public String getsMaterials() {
        return sMaterials;
    }

    public void setsMaterials(String sMaterials) {
        this.sMaterials = sMaterials;
    }

    public String geteRelevance() {
        return eRelevance;
    }

    public void seteRelevance(String eRelevance) {
        this.eRelevance = eRelevance;
    }

    public String getsRelevance() {
        return sRelevance;
    }

    public void setsRelevance(String sRelevance) {
        this.sRelevance = sRelevance;
    }

    public int getId() {
        return id;
    }

    //TRYING THIS - NEED HELP

    public void add(Activity activity) {
        activity.add(activity);
    }

    private ArrayList<Activity> activities = new ArrayList<>();

    public ArrayList<Activity> findAll() {
        return activities;
    }

    public ArrayList<Activity> findBySubject(String subject) {
        ArrayList<Activity> matchingActivities = new ArrayList<>();
        for (Activity activity : activities) {
            if (activity.geteSubject().contains(subject))
                matchingActivities.add(activity);
            }
            return matchingActivities;
        }




    //put methods here - turn off for now


 /*     Activity one = new Activity();
        model.addAttribute("activities", activityDao.findAll());
      for (Activity one : all) {
            if (one.geteSubject().equalsIgnoreCase("Literacy")) {
                activities.add(one);
                model.addAttribute(activities);
            }

        }
        return "search/results";
}*/


   public static Activity instance;

    public static Activity getInstance() {
        if(instance==null) {
            instance = new Activity();
        }
        return instance;
    }

}

/*
   private List<Activity> activities = new ArrayList<>();

    public Activity findById(int id) {
        for (Activity activity : activities) {
            if (activity.getId() == id)
                return activity;
        }
        return null;
    }

    public List<Activity> findAll() {return activities;}

    public List<Activity> findBySubject(String subjName) {

        List<Activity> matchingActivities = new ArrayList<>();

        for (Activity activity : activities) {
            if (activity.geteSubject().contains(subjName))
                matchingActivities.add(activity);
        }
        return matchingActivities;
    }  */

