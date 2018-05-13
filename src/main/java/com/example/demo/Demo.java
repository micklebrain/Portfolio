package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Demo implements CommandLineRunner {

    @Autowired
    private Environment env;


    public void run(String... strings) throws Exception {

        /*
        System.out.println(env.getProperty("PATH"));
        Map<String, String> allEnv = System.getenv();
        for (String key : allEnv.keySet()) {
            System.out.println("Environment variable key is " + key + " and value is : " + allEnv.get(key));

        }
        */

    }

}
