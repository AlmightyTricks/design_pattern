package com.design_patern.observer.without;

public class Amazon {
    private EmailService emailService;
    private InvoiceService invoiceService;
    private SMSService smsService;

    public Amazon(EmailService emailService, InvoiceService invoiceService, SMSService smsService) {
        this.emailService = emailService;
        this.invoiceService = invoiceService;
        this.smsService = smsService;
    }

    public void orderPlace() {
        emailService.sendEmail();
        smsService.sendSMS();
        invoiceService.generateInvoice();
    }
}
