public enum Genre {
    Horror("Scary books, not for before bedtime"),
    Drama("Dull long books"),
    Romatic("Stuff girls read"),
    Sifi("Best books out there");

    private String description;

    //Contrustor for enum, always private so no declaration.
    Genre(String description){
        this.description = description;
    }

    public String getDesciption(){
        return this.description;
    }
}
