package de.neueFische;

public class Friend extends Contact{

    private String name;
    private String telefonNummer;

    public Friend(String name, String telefonNummer){
        this.name = name;
        this.telefonNummer = telefonNummer;
    }


    public Friend(){

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + getName() + '\'' +
                ", telefonNummer='" + telefonNummer + '\'' +
                '}';
    }
}
