//package com.example.demo.Postgres;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "messages")
//public class Messages {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    private String senderemail;
//    private String subject;
//    private String content;
//
//    public Messages () {
//
//    }
//
//    public Messages(String senderemail, String subject, String content) {
//        this.senderemail = senderemail;
//        this.subject = subject;
//        this.content = content;
//    }
//
//    public String getSenderemail() {
//        return senderemail;
//    }
//
//    public void setSenderemail(String senderemail) {
//        this.senderemail = senderemail;
//    }
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//}
