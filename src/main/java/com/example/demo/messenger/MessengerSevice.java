package com.example.demo.messenger;

import com.example.demo.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Component
@RestController
public class MessengerSevice {

    @Autowired
    DataSource dataSource;

    @RequestMapping(
            value = "/send",
            method = RequestMethod.POST
    )
    public RedirectView sendMessage (@ModelAttribute Email email) {

        try {
            Connection connection = dataSource.getConnection();
            Statement msgStatement = connection.createStatement();
            String msgSQL = "insert into messages (senderemail, subject, content) " +
                    "values ('" + email.getFromRecipient() + "','" + email.getSubject() + "', '" + email.getContent() + "')";
            msgStatement.execute(msgSQL);
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return new RedirectView("/");
    }

}
