package Day2WorkHome;

public class Bed {
    private int cleanLinen;

    public Bed(int cleanLinen){
        this.cleanLinen = cleanLinen;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "cleanLinen=" + cleanLinen +
                '}';
    }

    public void clean(){
        cleanLinen = 0;

    }
}
