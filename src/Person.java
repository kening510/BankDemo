public class Person {
    private String name;
    private String personalNr;

    public Person() {
    }

    public Person(String name, String personalNr) {
        this.setName(name);
        this.setPersonalNr(personalNr);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalNr() {
        return personalNr;
    }

    public void setPersonalNr(String personalNr) {
        this.personalNr = personalNr;
    }
}
