package com.example.demo.messenger;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class EmailService {

//    @Autowired
//    public JavaMailSender emailSender;
//
//    @RequestMapping(
//            value = "/send",
//            method = RequestMethod.POST
//    )
//    public RedirectView sendEmail(@ModelAttribute Email email) {
//
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setTo("nathanthainguyen@gmail.com");
//        message.setSubject(email.getSubject());
//        message.setText(email.getContent());
//
//        emailSender.send(message);
//
//        return new RedirectView("/");
//    }

}
