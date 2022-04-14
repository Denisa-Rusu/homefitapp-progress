package com.example.homefit;

public class UserDetails {

    public String gender, height, weight, goalWeight, fitnessGoal, fitnessActivity, caloriesToBurn;


    public UserDetails() {

    }

    public UserDetails(String gender, String height, String weight, String goalWeight, String fitnessGoal, String fitnessActivity, String caloriesToBurn) {
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.goalWeight = goalWeight;
        this.fitnessGoal = fitnessGoal;
        this.fitnessActivity = fitnessActivity;
        this.caloriesToBurn = caloriesToBurn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getGoalWeight() {
        return goalWeight;
    }

    public void setGoalWeight(String goalWeight) {
        this.goalWeight = goalWeight;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }

    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
    }


    public String getFitnessActivity() {
        return fitnessActivity;
    }

    public void setFitnessActivity(String fitnessActivity) {
        this.fitnessActivity = fitnessActivity;
    }

    public String getCaloriesToBurn() {
        return caloriesToBurn;
    }

    public void setCaloriesToBurn(String caloriesToBurn) {
        this.caloriesToBurn = caloriesToBurn;
    }
}
