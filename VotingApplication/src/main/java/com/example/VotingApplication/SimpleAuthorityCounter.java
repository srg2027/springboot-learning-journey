package com.example.VotingApplication;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("simpleauthoritycounter")
public class SimpleAuthorityCounter implements AuthorityCounter{
    @PostConstruct
    public void init(){
        System.out.println("DB connection sucessfull");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Voting has been closed...!");
        System.out.println();
    }
    @Autowired
    private UserList userList;


    @Override
    public UserList getUserList() {
        return userList;
    }
}
