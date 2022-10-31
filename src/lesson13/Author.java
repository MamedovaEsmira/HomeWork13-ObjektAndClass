package lesson13;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName,String lastName){
this.firstName=firstName;
this.lastName=lastName;
    }
    public String toString(){return "Автор " +firstName +" "+lastName;}
    public String getName(){return firstName+lastName;}
}
