package com.design_patern.proxy;

public class Client {
    public static void main(String[] args) {
        /**
         * User with valid Username and Password
         */
        System.out.println("================= XYZ Employee Trying To Download PDF =================");
        User employee = new User("emp01", "root");
        WebsiteProxy websiteProxy = new WebsiteProxy(employee);
        websiteProxy.downloadFile();

        /**
         * User with invalid Username and Password
         */
        System.out.println("================= Non XYZ Employee Trying To Download PDF =================");
        User normalUSer = new User("normaluser", "root");
        websiteProxy = new WebsiteProxy(normalUSer);
        websiteProxy.downloadFile();

    }
}
