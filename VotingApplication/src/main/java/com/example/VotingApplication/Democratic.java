package com.example.VotingApplication;

import org.springframework.stereotype.Component;

@Component("democratic")
public class Democratic implements PoliticalParty{
    private String partyName="democratic";
    @Override
    public String getPartyName(){
        return this.partyName;
    }

}
