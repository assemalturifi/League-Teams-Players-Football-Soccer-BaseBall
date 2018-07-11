package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String leagueName;
    private ArrayList<T> league=new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addTeam(T team){
        if(this.league.contains(team)){
            System.out.println(team.getTeamName()+" is already in the league list.");
            return false;
        }
        else{
            this.league.add(team);
            return true;
        }
    }
    public void showLeagueTable(){
        Collections.sort(league);
        for(T t:league){
            System.out.println(t.getTeamName()+": "+t.ranking());
        }

    }

}
