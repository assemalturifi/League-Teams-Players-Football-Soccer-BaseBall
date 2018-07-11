package com.company;

//ArrayList<Team>teams;
//Collections.sort(teams);
//Create a generic class to implement a league table for a sport.
//The class should allow teams to be added to the list, and store
//a list of teams that belong to the league.

//your class should have a method to print out the teams in order,
//with the teams at the top of the league printed first.

//only teams of the same type should be added to any particular
//instance of the league class- the program should fail to compile,
//if an attempt is made to add an incompatible team.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        Team<FootballPlayer>any=new Team<>("");
        Team<FootballPlayer>any2=new Team<>("");
        Team<FootballPlayer>any3=new Team<>("");

        Team<SoccerPlayer>any4=new Team<SoccerPlayer>("");
        Team<SoccerPlayer>any5=new Team<SoccerPlayer>("");
        Team<SoccerPlayer>any6=new Team<SoccerPlayer>("");

        League<Team<FootballPlayer>>any7=new League<>("");
        League<Team<SoccerPlayer>>any8=new League<>("");


        boolean quit=false;
        int choice=0;
        while(!quit){
            printOptions();
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printOptions();
                    break;
                case 1:
                    addFootballLeague(any7,any,any2,any3);
                    break;
                case 2:
                    addSccoerLeague(any8,any4,any5,any6);
                    break;
                case 3:
                    quit=true;
                    break;
            }
        }

    }

    public static void addFootballLeague(League<Team<FootballPlayer>>footballLeague,Team<FootballPlayer> team, Team<FootballPlayer> team2,Team<FootballPlayer>team3) {

        System.out.println("Enter the League name: ");
        String leagueName=scanner.nextLine();
        footballLeague=new League<>(leagueName);

        footballLeague.addTeam(team);
        footballLeague.addTeam(team2);
        footballLeague.addTeam(team3);


        System.out.println("Enter a Football team name: ");
        String teamName=scanner.nextLine();
        team=new Team<>(teamName);
        System.out.println("Add a player to "+team.getTeamName());
        FootballPlayer one=new FootballPlayer(scanner.nextLine());
        team.addPlayer(one);


        System.out.println("Enter second Football team name: ");
        String teamName2=scanner.nextLine();
        team2=new Team<>(teamName2);
        System.out.println("Add a player to "+team2.getTeamName());
        FootballPlayer two=new FootballPlayer(scanner.nextLine());
        team2.addPlayer(two);

        System.out.println("Enter third Football team name: ");
        String teamName3=scanner.nextLine();
        team3=new Team<>(teamName3);
        System.out.println("Add a player to "+team3.getTeamName());
        FootballPlayer three=new FootballPlayer(scanner.nextLine());
        team3.addPlayer(three);


        System.out.println("Enter the scores: \n" +
                "How many did "+team.getTeamName()+" scored on "+team2.getTeamName()+" ? Enter a number: ");
        int score1=scanner.nextInt();
        System.out.println("How many did "+team2.getTeamName()+" scored on "+team.getTeamName()+" ? Enter a number: ");
        int score2=scanner.nextInt();

        System.out.println("How many did "+team2.getTeamName()+" scored on "+team3.getTeamName()+" ? Enter a number: ");
        int score3=scanner.nextInt();
        System.out.println("How many did "+team3.getTeamName()+" scored on "+team2.getTeamName()+" ? Enter a number: ");
        int score4=scanner.nextInt();

        System.out.println("How many did "+team.getTeamName()+" scored on "+team3.getTeamName()+" ? Enter a number: ");
        int score5=scanner.nextInt();
        System.out.println("How many did "+team3.getTeamName()+" scored on "+team.getTeamName()+" ? Enter a number: ");
        int score6=scanner.nextInt();



        team.mathchResult(team2,score1,score2);
        team2.mathchResult(team3,score3,score4);
        team.mathchResult(team3,score5,score6);
        System.out.println();

        System.out.println(team.getTeamName()+" had "+team.numPlayers()+" member playars.");
        System.out.println(team2.getTeamName()+" had "+team2.numPlayers()+" member playars.\n");
        System.out.println(team3.getTeamName()+" had "+team3.numPlayers()+" member playars.\n");

        System.out.println("Rankings: ");
        System.out.println(team.getTeamName()+": "+team.ranking());
        System.out.println(team2.getTeamName()+": "+team2.ranking());
        System.out.println(team3.getTeamName()+": "+team3.ranking()+"\n");

    }
    public static void addSccoerLeague(League<Team<SoccerPlayer>>soccerLeague,Team<SoccerPlayer>team,Team<SoccerPlayer>team2,Team<SoccerPlayer>team3){

        System.out.println("Enter the League name: ");
        String leagueName=scanner.nextLine();
        soccerLeague=new League<>(leagueName);

        soccerLeague.addTeam(team);
        soccerLeague.addTeam(team2);
        soccerLeague.addTeam(team3);

        System.out.println("Enter the Soccer team name: ");
        String teamName=scanner.nextLine();
        team=new Team<>(teamName);
        System.out.println("Add a player to "+team.getTeamName());
        SoccerPlayer one=new SoccerPlayer(scanner.nextLine());
        team.addPlayer(one);


        System.out.println("Enter second Soccer team name: ");
        String teamName2=scanner.nextLine();
        team2=new Team<>(teamName2);
        System.out.println("Add a player to "+team2.getTeamName());
        SoccerPlayer two=new SoccerPlayer(scanner.nextLine());
        team2.addPlayer(two);

        System.out.println("Enter third Soccer team name: ");
        String teamName3=scanner.nextLine();
        team3=new Team<>(teamName3);
        System.out.println("Add a player to "+team3.getTeamName());
        SoccerPlayer three=new SoccerPlayer(scanner.nextLine());
        team3.addPlayer(three);


        System.out.println("Enter the scores: \n" +
                "How many did "+team.getTeamName()+" scored on "+team2.getTeamName()+" ? Enter a number: ");
        int score1=scanner.nextInt();
        System.out.println("How many did "+team2.getTeamName()+" scored on "+team.getTeamName()+" ? Enter a number: ");
        int score2=scanner.nextInt();

        System.out.println("How many did "+team2.getTeamName()+" scored on "+team3.getTeamName()+" ? Enter a number: ");
        int score3=scanner.nextInt();
        System.out.println("How many did "+team3.getTeamName()+" scored on "+team2.getTeamName()+" ? Enter a number: ");
        int score4=scanner.nextInt();

        System.out.println("How many did "+team.getTeamName()+" scored on "+team3.getTeamName()+" ? Enter a number: ");
        int score5=scanner.nextInt();
        System.out.println("How many did "+team3.getTeamName()+" scored on "+team.getTeamName()+" ? Enter a number: ");
        int score6=scanner.nextInt();



        team.mathchResult(team2,score1,score2);
        team2.mathchResult(team3,score3,score4);
        team.mathchResult(team3,score5,score6);

        System.out.println();

        System.out.println(team.getTeamName()+" had "+team.numPlayers()+" member playars.");
        System.out.println(team2.getTeamName()+" had "+team2.numPlayers()+" member playars.\n");
        System.out.println(team3.getTeamName()+" had "+team3.numPlayers()+" member playars.\n");

        System.out.println("Rankings: ");
        System.out.println(team.getTeamName()+": "+team.ranking());
        System.out.println(team2.getTeamName()+": "+team2.ranking());
        System.out.println(team3.getTeamName()+": "+team3.ranking()+"\n");

    }
    public static void printOptions() {
        System.out.println("Available actions:\npress any of the actions below: ");
        System.out.println("0 - TO print menu options\n" +
                "1 - TO add Football league\n" +
                "2 - TO add Soccer league \n" +
                "3 - to quit");
    }
}

