package Day2;

public class User {
    private int id;
    private String name;
    private String password;
    private Language language;

    public User(int id, String name, String password, Language language) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.language = language;
    }
    public User( String name, String password, Language language) {
        this.name = name;
        this.password = password;
        this.language = language;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
