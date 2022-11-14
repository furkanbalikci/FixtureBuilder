import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args)   {
        List<String> teamList = new ArrayList<>();
        teamList.add("Galatasaray");
        teamList.add("Bursaspor");
        teamList.add("Fenerbahçe");
        teamList.add("Beşiktaş");
        teamList.add("Başakşehir");
        teamList.add("Trabzonspor");
        //teamList.add("BoluSpor");

        Fixture fixture = new Fixture(teamList);
        fixture.shuffle();


    }
}