//package com.example.quizapp;
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class QuestionsList {
//    private ArrayList<Questions> selectedQuestions;
//    private ArrayList<Questions> questionsList;
//    private int score;
//
//    public QuestionsList() {
////        this.selectedQuestions = selectedQuestions;
////        this.questionsList = questionsList;
//        questionsList = new ArrayList<Questions>();
//        selectedQuestions = new ArrayList<Questions>();
//        questionsList.add(new Questions("Canada's birthday is on:?","July 1st", new String[]{" July 1st", "July 4th", "July 15th", "July 10th"}));
//        questionsList.add(new Questions("The capital city of Canada is:","Ottawa", new String[]{"Montreal", "Ottawa", "Toronto", " Vancouver"}));
//        questionsList.add(new Questions("The largest proivnce in Canada is:","Nunavut", new String[]{"Quebec", "Nunavut", "British Columbia", "\tNorthwest Territories"}));
//        questionsList.add(new Questions("Canada has _____ provinces.","10", new String[]{"15", "5", "7", "10"}));
//        questionsList.add(new Questions("The smallest province in Canada is:","Prince Edward Island", new String[]{"Nova Scotia", "Prince Edward Island", "Quebec", "British Columbia"}));
//        questionsList.add(new Questions("The only province in Canada which has a majority of French speakers is:","Quebec", new String[]{"Quebec", "Ontario", "Montreal", "Nova Scotia"}));
//        questionsList.add(new Questions("The leader of Canada is known as the:","prime minister", new String[]{"premier", "emperor", "prime minister", "president"}));
//        questionsList.add(new Questions("The current prime minister of Canada is:","Justin Trudeau", new String[]{"Pierre Trudeau", "Wayne Gretzky", "Justin Trudeau", "Donald Trump"}));
//        questionsList.add(new Questions("Canada is famous for:","Niagara Falls", new String[]{"Niagara Falls", "Victoria Falls", "Yosemite Falls", "Sahara"}));
//        questionsList.add(new Questions("The animal which is a symbol of Canada is the:","The beaver", new String[]{"grizzly bear", "killer whale", "chicken", "The beaver"}));
//
//        Collections.shuffle(questionsList);
//        selectedQuestions.add(questionsList.get(0));
//        selectedQuestions.add(questionsList.get(1));
//        selectedQuestions.add(questionsList.get(2));
//        selectedQuestions.add(questionsList.get(3));
//
//        this.score = 0;
//    }
//
//    public ArrayList<Questions> getSelectedQuestions() {
//        return selectedQuestions;
//    }
//
//    public void setSelectedQuestions(ArrayList<Questions> selectedQuestions) {
//        this.selectedQuestions = selectedQuestions;
//    }
//
//    public ArrayList<Questions> getQuestionsList() {
//        return questionsList;
//    }
//
//    public void setQuestionsList(ArrayList<Questions> questionsList) {
//        this.questionsList = questionsList;
//    }
//
//    public int getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
//}
