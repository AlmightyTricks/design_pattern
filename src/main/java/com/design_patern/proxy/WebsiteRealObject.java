package com.design_patern.proxy;

public class WebsiteRealObject implements IWebsiteSubject{
    @Override
    public void downloadFile() {
        System.out.println("PDF file is downloading...");
    }
}
