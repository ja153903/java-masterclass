package generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//
//        printDoubled(items);
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        // Now there is a problem because they are Baseball and Soccer players
        // adelaideCrows.addPlayer(pat);
        // adelaideCrows.addPlayer(beckham);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        System.out.println(adelaideCrows.numPlayers());
    }

    private static void printDoubled(ArrayList n) {
        for (Object i: n) {
            System.out.println((Integer) i * 2);
        }
    }
}
