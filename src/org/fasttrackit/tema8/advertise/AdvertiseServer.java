package org.fasttrackit.tema8.advertise;

public class AdvertiseServer {

    private EmailAds emailAds;
    private FacebookAds facebookAds;
    private PrinterAds printerAds;

    public AdvertiseServer(EmailAds emailAds, FacebookAds facebookAds, PrinterAds printerAds) {
        this.emailAds = emailAds;
        this.facebookAds = facebookAds;
        this.printerAds = printerAds;
    }

    public EmailAds getEmailAds() {
        return emailAds;
    }

    public void setEmailAds(EmailAds emailAds) {
        this.emailAds = emailAds;
    }

    public FacebookAds getFacebookAds() {
        return facebookAds;
    }

    public void setFacebookAds(FacebookAds facebookAds) {
        this.facebookAds = facebookAds;
    }

    public PrinterAds getPrinterAds() {
        return printerAds;
    }

    public void setPrinterAds(PrinterAds printerAds) {
        this.printerAds = printerAds;
    }

    public void publishToAll(String advertise) {
        emailAds.publishAds(advertise);
        facebookAds.publishAds(advertise);
        printerAds.publishAds(advertise);
    }

    public void publishToEmailOnly(String advertise) {
        emailAds.publishAds(advertise);
    }

    public void publishToFacebookOnly(String advertise) {
        facebookAds.publishAds(advertise);
    }

    public void publishOnlyToPrinter(String advertise) {
        printerAds.publishAds(advertise);
    }
}
