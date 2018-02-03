package com.example.southside.models.forms;

import com.example.southside.models.Activity;

import javax.validation.constraints.NotNull;

public class SearchForm {

    private Activity activity;

    public Activity getActivity() { return activity; }

    public void setActivity(Activity activity) {this.activity = activity;}

    @NotNull
    private int activityId;

    public int getActivityId() { return activityId; }

    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public SearchForm(Activity activity, String keyword) {
        this.activity=activity;
        this.keyword=keyword;
    }

    public SearchForm() {}
}
