package org.fasttrackit.tema8.advertise;

public class FacebookAds implements AdvertiseSender {

    public void publishAds(String mesaj) {

        System.out.println("Facebook Adv: " + mesaj);
    }
}
