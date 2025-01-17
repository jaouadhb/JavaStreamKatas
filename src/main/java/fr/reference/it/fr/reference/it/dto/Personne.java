package fr.reference.it.fr.reference.it.dto;

public class Personne {

    private String name;
    private int age;
    private String nationality;

    public Personne(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Personne(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
