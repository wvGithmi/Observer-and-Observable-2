package com.company;

public class Main {

    public static void main(String[] args) {

        PostOffice po = new PostOffice();
        Person chris = new Person("Chris");
        Person john = new Person("John");
        Mail m = new Mail("John", "Dundee", "You have got a present");

        po.Attach(chris);
        po.Attach(john);

        po.addMail(m);

    }

}
