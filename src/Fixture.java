import java.util.*;
import java.util.Random;
public class Fixture {

    List<String> teamList;

    LinkedHashSet<List<String>> listHashSet = new LinkedHashSet<>();
    public Fixture(List<String> teamList) {
        this.teamList = teamList;

        if (this.teamList.size() % 2 != 0){
            this.teamList.add("Bay");}

    }

    public void shuffle() {
        System.out.println(this.teamList);

        for (int i = 0; i < this.teamList.size() - 1; i++) {

            List<String> tempTeamList = new ArrayList<>(this.teamList);
            System.out.println("Round " + (i+1));

            for (int j = 0; j < (teamList.size() / 2) ; j++) {
                while (true){

                    List<String> matchList = new ArrayList<>();
                    String team1 = tempTeamList.get(new Random().nextInt(tempTeamList.size()));
                    tempTeamList.remove(team1);
                    String team2 = tempTeamList.get(new Random().nextInt(tempTeamList.size()));
                    tempTeamList.remove(team2);


                    int oldListSize = listHashSet.size();
                    matchList.add(team1);
                    matchList.add(team2);
                    listHashSet.add(matchList);


                    int newListSize = listHashSet.size();
                    if (newListSize > oldListSize){
                        System.out.println(team1 +  " vs " +  team2);
                        break;
                    }else {
                        tempTeamList.add(team1);
                        tempTeamList.add(team2);
                    }
                }

            }

        }
        int round = this.teamList.size();
        int count = round / 2;

        for (List deplasman:listHashSet) {
            if (count % (this.teamList.size() / 2) == 0) {
                System.out.println("Round " + round++);
            }
            Collections.reverse(deplasman);
            System.out.println(deplasman.get(0) + " vs " + deplasman.get(1));
            count++;

        }

    }

}
