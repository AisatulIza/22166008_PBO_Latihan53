/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166008_pbo_lat53;
/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Semester  : 3
* Prodi     : Sistem Informasi
* Matkul    : PBO
**/
//kelas Animal
public class Animal {
    //variabel
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    //konstruktor
    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    //metode get
    public String getEats() {
        return eats;
    }
    public int getNoOfLegs() {
        return noOfLegs;
    }
}
//kelas rabbit turunan dari kelas animal
class Rabbit extends Animal {
    //variabel
    private final String color;
    private final String name;
    //konstruktor
    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
        this.name = name;
    }
    //metode get
    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
    //menjalankan program
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is " + rabbit.getName());
        System.out.println(rabbit.getName() + " is Vegetarian? " + rabbit.isVegetarian());
        System.out.println(rabbit.getName() +  " eats " + rabbit.getEats());
        System.out.println(rabbit.getName() + " has " + rabbit.getNoOfLegs() + " legs");
        System.out.println(rabbit.getName() + " color is " + rabbit.getColor());
    }
}
