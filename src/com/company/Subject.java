package com.company;

public interface Subject {

    void Attach(Observer o);
    void Dettach(Observer o);
    void notify(Observer o);

}
