package doUsuniecia;

import java.util.ArrayList;

public class Town {


    ArrayList<Citizen> people = new ArrayList<>();

    public void dodawaj(Citizen citizen) {
        people.add(citizen);
    }

    public int howManyCanVote() {
        int count = 0;
        for (Citizen person : people) {
            if (person.CanVote()) {
                count++;
            }

        }
        return count;
    }

    public void whoCanVote() {
        for (Citizen person : people) {
            if (person.CanVote())
                System.out.println(person.getName());
        }
    }

    @Override
    public String toString() {
        return "Town{" +
                "people=" + people +
                '}';

    }
}
