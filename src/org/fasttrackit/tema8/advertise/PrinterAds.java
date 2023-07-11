package org.fasttrackit.tema8.advertise;

public class PrinterAds implements AdvertiseSender {
    public void publishAds(String mesaj) {

        System.out.println("Print Ads: " + mesaj);
    }
}
