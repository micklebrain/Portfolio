package com.example.demo.messenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class messengerClient {

//    @Autowired
//    DataSource dataSource;

    public void storeMessage(String senderEmail, String subject, String content) {
//        try {
//            Connection connection = dataSource.getConnection();
//            Statement msgStatement = connection.createStatement();
//            String msgSQL = "insert into messages (senderemail, subject, content) values ("+ senderEmail + "," + subject + "," + content + ")";
//            msgStatement.execute(msgSQL);
//        } catch (SQLException e) {
//
//        }
    }

}
