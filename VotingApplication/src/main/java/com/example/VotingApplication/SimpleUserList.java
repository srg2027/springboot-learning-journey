package com.example.VotingApplication;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component("userlist")
public class SimpleUserList implements UserList{
    List<User> listOfUser;
    public SimpleUserList(){
        this.listOfUser=new ArrayList<User>();
    }
    @Override
    public void addUser(User user) {
        listOfUser.add(user);

    }

    @Override
    public List<User> getUserList() {
        return listOfUser;
    }
}
