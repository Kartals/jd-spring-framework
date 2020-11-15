package service;

import implementation.Mentor;

public class PartTimeMentor implements Mentor { // Mentor interface implements ettiğimiz zaman hata vermemesi için metod override yapılıyor
    @Override
    public void createAccount() {
        System.out.println("Part Time Mentor Account is created...");
    }
}
