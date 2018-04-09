package com.example.demo.model;

public class Email {

    private String fromRecipient;
    private String toRecipient;
    private String subject;
    private String content;

    public Email() { }

    public Email (String from, String to, String subject, String content) {
        this.fromRecipient = from;
        this.toRecipient = to;
        this.subject = subject;
        this.content = content;
    }

    public String getFromRecipient() {
        return fromRecipient;
    }

    public void setFromRecipient(String fromRecipient) {
        this.fromRecipient = fromRecipient;
    }

    public String getToRecipient() {
        return toRecipient;
    }

    public void setToRecipient(String toRecipient) {
        this.toRecipient = toRecipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "from='" + fromRecipient + '\'' +
                ", to='" + toRecipient + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
