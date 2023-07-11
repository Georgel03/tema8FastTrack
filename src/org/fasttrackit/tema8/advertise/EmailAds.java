package org.fasttrackit.tema8.advertise;

public class EmailAds implements AdvertiseSender {
    public void publishAds(String mesaj) {

        System.out.println("Email Ads: " + mesaj);
    }
}
