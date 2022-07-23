package Day2PostOffice;

public class Adres {
    private String street;
    private int nrHouse;
    private String postCode;

    @Override
    public String toString() {
        return "Adres{" +
                "street='" + street + '\'' +
                ", nrHouse=" + nrHouse +
                ", postCode='" + postCode + '\'' +
                '}';
    }

    public Adres(String street, int nrHouse, String postCode) {
        this.street = street;
        this.nrHouse = nrHouse;
        this.postCode = postCode;
    }
}
