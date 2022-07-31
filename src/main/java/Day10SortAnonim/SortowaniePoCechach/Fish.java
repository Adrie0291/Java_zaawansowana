package Day10SortAnonim.SortowaniePoCechach;

public class Fish implements Comparable<Fish> {
    private String name;
    private int age;


    @Override
    public int compareTo(Fish o) {
        int ageCompare = age - o.age; // wynik porównania age
        if (ageCompare == 0) {        // jeœli równy 0
            return name.compareTo(o.name); // sortuj po nazwie
        }
        return ageCompare;
    }

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + "\n";
    }
}
