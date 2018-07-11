package com.company;

import java.util.ArrayList;
//the team class is paramatized type that bounded by Player class
public class Team<T extends Player>implements Comparable<Team<T>> {//<T> to indicate that there's gonna be a type there.(in the main Team<Football> etc)You can use any; String, Player any type.When it is like this Jva doesnt know what kind of object you used, that why in add method you have to cast ((Player)player).getName)
    //<T extends Player> to indicate that you can use just Player type and in the add method you dont have to cast as it is bellow
    //implements Comparable<Team<T>>to compara the teams which one is higer, and T for again for generics
    private String teamName;
    int played=0;
    int won=0;
    int tied=0;
    int lost=0;

    private ArrayList <T> members=new ArrayList<>();//it used to be ArrayList<Player>,this array just accepting a genric Player type

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }
    public boolean addPlayer(T player){//by writing T, we making it more
        // generic and it is going to work for any type of player.
        // And how tjis basically works is when we actually
        // instantiate a class the T will be replaced automatically by
        // java with the actual class(with the real type) we're using.
        //so T has been changed from player type to T this is being called parameterized!
        //so T is more geric and the type is not known.Thats why we are casting the
        // player.getName() and we put in the beggining (Player).

        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team.");
            return false;
        } else {
            members.add(player);
            System.out.println("\n"+player.getName() + " picked for team " + this.teamName);
            return true;
        }

    }
    public int numPlayers(){
        return this.members.size();
    }

    public void mathchResult(Team <T> opponent, int ourScore, int theirScore){// I used here again <T> because when we use this method we can get the results with different kind of teams. we want a specific one football soccer or etc.
        String message;
        if(ourScore>theirScore){
            won++;
            message=" beat ";
        }
        else if(ourScore==theirScore){
            tied++;
            message=" drew with ";
        }
        else{
            lost++;
            message=" lost to ";
        }
        played++;
        if(opponent!=null){
            System.out.println(this.getTeamName()+message+opponent.getTeamName());
            opponent.mathchResult(null, theirScore,ourScore);//we call null here so the
            // matchresult method wont excute again! And we assign by writing to ourscore their score
            //we are saving their score as well! very smart way
        }

    }
    public int ranking(){//just our ranking view
        return (won*2)+tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()>team.ranking()){
            return  -1;
        }
        else if(this.ranking()<team.ranking()){
            return  1;
        }
        else{
            return 0;
        }
    }
}
