public class Book extends Item {
    private int isbn_number;
    private String author;

    public int getIsbn_number() {
        return isbn_number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public Book(){

    }
    public Book(String newTitle, int newIsbn_number, String newAuthor){
    setTitle(newTitle);
    this.isbn_number = newIsbn_number;
    this.author = newAuthor;
    }
    @Override
    public String getListing(){
        return "Book name - " + getTitle() + "\nAuthor - " + author + "\nISBN# - " + isbn_number + "\n";
    }
}
