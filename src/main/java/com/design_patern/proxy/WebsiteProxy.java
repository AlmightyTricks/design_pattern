package com.design_patern.proxy;

public class WebsiteProxy implements IWebsiteSubject{
    IWebsiteSubject iWebsiteSubject;
    User user;

    WebsiteProxy(User user) {
        this.user = user;
    }

    @Override
    public void downloadFile() {
        // let username = "emp01" and password = "root"
        if(
                this.user.getUsername().equals("emp01") && this.user.getPassword().equals("root")
        ) {
            iWebsiteSubject = new WebsiteRealObject();
            iWebsiteSubject.downloadFile();
        } else {
            System.out.println("(Unauthorized): You don't have access to the system.");
        }
    }
}
