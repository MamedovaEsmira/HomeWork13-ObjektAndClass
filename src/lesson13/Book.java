package lesson13;

public class Book {
 private String titleOfTheBook;//название книги
 private Author nameAuthor;    //автор
 private int yearOfPublication; //год публикации

 public Book(String titleOfTheBook, Author nameAuthor, int yearOfPublication) {
  this.titleOfTheBook = titleOfTheBook;
  this.nameAuthor = nameAuthor;
  this.yearOfPublication = yearOfPublication;
 }

 public String toString() {return titleOfTheBook + " " + nameAuthor + " " + yearOfPublication;}
public String titleOfTheBook(){return titleOfTheBook;}
 public Author getName(){return nameAuthor;}
 public int getYearOfPublication() {return yearOfPublication;}
 public int setyearOfPublication(int yearOfPublication ){  this.yearOfPublication = yearOfPublication;
 return yearOfPublication;}
}

