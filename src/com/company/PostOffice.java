package com.company;

import java.util.ArrayList;

public class PostOffice implements Subject{

    public ArrayList<Mail> allMail;
    private ArrayList<Observer> observers;

    public PostOffice(){
        allMail = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addMail(Mail m){
        allMail.add(m);
        Notify();
    }

    public ArrayList<Mail> getState(){
        return allMail;
    }

    public void Attach(Observer o){
        observers.add(o);
    }

    public void Dettach(Observer o){
        observers.remove(o);
    }

    @Override
    public void notify(Observer o) {

    }

    public void Notify(){

        for (int i = 0 ; i < observers.size() ; i++){
            observers.get(i).update(this);
        }

    }

}
