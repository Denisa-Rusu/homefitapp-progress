package com.example.homefit;

public class UserRecord {

    public String week1CaloriesBurned, week2CaloriesBurned, week3CaloriesBurned, week4CaloriesBurned, overallCaloriesBurned;

    public UserRecord() {

    }

    public UserRecord(String week1CaloriesBurned, String week2CaloriesBurned, String week3CaloriesBurned, String week4CaloriesBurned,
                      String overallCaloriesBurned) {

        this.week1CaloriesBurned = week1CaloriesBurned;
        this.week2CaloriesBurned = week2CaloriesBurned;
        this.week3CaloriesBurned = week3CaloriesBurned;
        this.week4CaloriesBurned = week4CaloriesBurned;
        this.overallCaloriesBurned = overallCaloriesBurned;

    }

    public String getWeek1CaloriesBurned() {
        return week1CaloriesBurned;
    }

    public void setWeek1CaloriesBurned(String week1CaloriesBurned) {
        this.week1CaloriesBurned = week1CaloriesBurned;
    }

    public String getWeek2CaloriesBurned() {
        return week2CaloriesBurned;
    }

    public void setWeek2CaloriesBurned(String week2CaloriesBurned) {
        this.week2CaloriesBurned = week2CaloriesBurned;
    }

    public String getWeek3CaloriesBurned() {
        return week3CaloriesBurned;
    }

    public void setWeek3CaloriesBurned(String week3CaloriesBurned) {
        this.week3CaloriesBurned = week3CaloriesBurned;
    }

    public String getWeek4CaloriesBurned() {
        return week4CaloriesBurned;
    }

    public void setWeek4CaloriesBurned(String week4CaloriesBurned) {
        this.week4CaloriesBurned = week4CaloriesBurned;
    }

    public String getOverallCaloriesBurned() {
        return overallCaloriesBurned;
    }

    public void setOverallCaloriesBurned(String overallCaloriesBurned) {
        this.overallCaloriesBurned = overallCaloriesBurned;
    }


}
