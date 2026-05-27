package Person;

/*
 * File: Person.java 
 * Deskripsi: Person database model
 */

public class Person  {
    // atribut
    private int id;
    private String name;
    
    // metode
    public Person(String n){
        name = n;
    }
    
    public Person (int i, String n){
        id = i;
        name = n;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}
