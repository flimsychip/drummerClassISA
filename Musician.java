package isa;

public class Musician extends Person {
    private String band;

    public Musician() {
        super();
    }

    public Musician(String name, int age, String band) {
        super(name, age);
        this.band = band;
    }

    public String getBand() {
        return this.band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public void sayHi() {
        super.sayHi();
        System.out.println("hi. i am a musician.");
    }

    public String toString() {
        return super.toString() + "\nthis person is a musician. their band is called \"" + this.band + "\"";
    }
}
