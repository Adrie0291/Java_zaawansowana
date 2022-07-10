package Day2WorkHome;

public class Window {

    private boolean open = false;
    public void doOpen(){
        open = true;
    }
    @Override
    public String toString() {
        return "Window{" +
                "open=" + open +
                '}';
    }
}
