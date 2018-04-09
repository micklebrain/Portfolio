package com.example.demo.messenger;

import com.example.demo.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
public class EmailService {

    @Autowired
    public JavaMailSender emailSender;

    @RequestMapping(
            value = "/send",
            method = RequestMethod.POST
    )
    public void sendEmail(@ModelAttribute Email email) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("nathanthainguyen@gmail.com");
        message.setSubject(email.getSubject());
        message.setText(email.getContent());

        emailSender.send(message);

    }

}
