package de.neueFische;

import java.util.ArrayList;

public class Smartphone implements Radio, GPS{

    private String model;
    private String nameHersteller;
    private ArrayList<Friend> kontakte;



    public Smartphone(String model, String nameHersteller, ArrayList<String> kontakte){
        this.model = model;
        this.nameHersteller = nameHersteller;
        this.kontakte = kontakte;
    }

    public Smartphone(){

    }

    @Override
    public boolean startRadio(){
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio(){
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", nameHersteller='" + nameHersteller + '\'' +
                ", kontakte=" + kontakte +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNameHersteller(String nameHersteller) {
        this.nameHersteller = nameHersteller;
    }

    public void setKontakte(ArrayList<Friend> kontakte) {
        this.kontakte = kontakte;
    }

    public String getModel() {

        return model;
    }

    public String getNameHersteller() {

        return nameHersteller;
    }

    public ArrayList<Friend> getKontakte() {

        return kontakte;
    }
}
