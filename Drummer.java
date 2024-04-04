package isa;

public class Drummer extends Musician {
    private String drumBrand;

    public Drummer() {
        super();
    }

    public Drummer(String name, int age, String band, String brand) {
        super(name, age, band);
        this.drumBrand = brand;
    }

    public String getDrumBrand() {
        return this.drumBrand;
    }

    public void setDrumBrand(String brand) {
        this.drumBrand = brand;
    }

    public void sayHi() {
        super.sayHi();
        System.out.println("hi. i am a drummer.");
    }

    public String toString() {
        return super.toString() + "\nthey are the drummer for the band, and they play on a " + this.drumBrand;
    }
}
