public class Book {
    private Genre genre;

    public Book(Genre a_genre){
        this.genre = a_genre;
    }


    public Genre getGenre(){
        return this.genre;
    }

    public String getDescription() {
        return this.genre.getDesciption();
    }



} // end class Book
