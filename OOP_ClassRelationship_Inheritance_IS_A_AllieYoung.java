package isa;

public class OOP_ClassRelationship_Inheritance_IS_A_AllieYoung {
    public static void main(String[] args) {
        test();
    }

    static void test() {
        Drummer drummerA = new Drummer("michael cavanagh", 33, "king gizzard and the lizard wizard", "ludwig acrolite");
        //inherited method test
        System.out.println(drummerA.getName());
        drummerA.sayHi();
    }
}

/* diagram of class relationships:

 Person
   ^
 IS-A
   |
Musician
   ^
 IS-A
   |
Drummer

 */