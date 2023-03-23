
public class People {
    public String name;
    private String fullName;

    public People(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String toString() {
        return String.format("%s", getFullName());
    }

}
