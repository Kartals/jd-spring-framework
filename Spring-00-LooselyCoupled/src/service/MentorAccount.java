package service;

import implementation.Mentor;

public class MentorAccount {

    Mentor mentor;        // making a composition with Mentor interface

    public MentorAccount(Mentor mentor) {    // creating a constructor
        this.mentor = mentor;
    } // creating a constructor with Generator

    public void manageAccount(){      // create a method called manageAccount
        this.mentor.createAccount();
    }
}
