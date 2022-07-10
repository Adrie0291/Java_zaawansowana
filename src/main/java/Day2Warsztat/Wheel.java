package Day2Warsztat;

public class Wheel {
    private double pressure;
    private boolean flat = false;
    public boolean isFlat() {
        return flat;
    }
    public Wheel(double pressure) {
        this.pressure = pressure;

    }
    public void repair(double pressue) {
        this.pressure = pressue;
        flat = false;
    }
    public void doflatTire() {
        pressure = 0;
        flat = true;

    }
    /* 1. podejœcie do przebicia opony, lepiej tak nie robiæ .
        public void setPressure(double pressure) {
            this.pressure = pressure;
        }
        public void setFlat(boolean flat) {
            this.flat = flat;
        }
     */
    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                ", flat=" + flat +
                '}';
    }
}
