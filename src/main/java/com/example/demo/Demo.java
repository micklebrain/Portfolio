package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Demo implements CommandLineRunner {

    @Autowired
    private Environment env;


//    @Bean
//    public JavaMailSender getJavaMailSender() {
//        final String host = "smtp.gmail.com";
//        final String username = "nathanthainguyen@gmail.com";
//        final String password = "Cabinboy23";
//        final int port = 587;
//
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost(host);
//        mailSender.setPort(port);
//
//        mailSender.setUsername(username);
//        mailSender.setPassword(password);
//
//        Properties props = mailSender.getJavaMailProperties();
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.debug", "true");
//
//        return mailSender;
//    }

    public void run(String... strings) throws Exception {

//        List<Messages> messages = messagesService.findAll();
//
//        for (Messages message : messages) {
//            System.out.println(message.getContent());
//        }

        /*
        System.out.println(env.getProperty("PATH"));
        Map<String, String> allEnv = System.getenv();
        for (String key : allEnv.keySet()) {
            System.out.println("Environment variable key is " + key + " and value is : " + allEnv.get(key));

        }
        */

//        Email from = new Email("app91857844@heroku.com");
//        String subject = "test";
//        Email to = new Email("app91857844@heroku.com");
//        Content content = new Content("text/plain", "Hello!");
//        Mail mail = new Mail(from, subject, to, content);
//
//        SendGrid sg = new SendGrid("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");
//        Request request = new Request();
//        try {
//            request.setMethod(Method.POST);
//            request.setEndpoint("mail/send");
//            request.setBody(mail.build());
//            Response response = sg.api(request);
//            System.out.println(response);
//        } catch (IOException ex) {
//            throw ex;
//        }


//        Email email = new Email();
//        email.setFromRecipient("nathanthainguyen@gmail.com");
//        email.setToRecipient("megooogle23@gmail.com");
//        email.setSubject("This is the subject");
//        email.setContent("Hello I would like to hire you");

//        emailService.sendEmail(email);
    }

}
