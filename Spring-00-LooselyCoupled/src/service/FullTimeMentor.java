package service;

import implementation.Mentor;

public class FullTimeMentor implements Mentor { // Mentor interface implements ettiğimiz zaman hata vermemesi için metod override yapılıyor
    @Override
    public void createAccount() {
        System.out.println("Full Time Mentor Account is created...");
    }
}
