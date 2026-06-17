package com.example.VotingApplication;

import org.springframework.stereotype.Component;

@Component("republic")
public class Repbulic implements  PoliticalParty{
    private String partyName="republic";

    @Override
    public String getPartyName(){
        return this.partyName;
    }
}
