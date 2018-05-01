package com.example.demo.messenger;

import com.example.demo.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@Component
@RestController
public class EmailService {

    @Autowired
    public JavaMailSender emailSender;

    @RequestMapping(
            value = "/send",
            method = RequestMethod.POST
    )
    public RedirectView sendEmail(@ModelAttribute Email email) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("nathanthainguyen@gmail.com");
        message.setSubject(email.getSubject());
        message.setText(email.getContent());

        emailSender.send(message);

        return new RedirectView("/");
    }

}
