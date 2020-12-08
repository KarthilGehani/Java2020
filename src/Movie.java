public class Movie {
    private String title;
    private String studio;
    private String rating;
    public Movie() {
        title = "Frozen";
        studio = "Disney";
        rating = "Pg";
    }
    public Movie(String title1, String studio1, String rating1) {
        title = title1;
        studio = studio1;
        rating = "Pg";
    }
    public void setTitle(String title1){
        title = title1;
    }
    public void setStudio(String studio1){
       studio = studio1;
    }
    public void setRating(String rating1){
        rating = rating1;
    }
    public String getTitle(){
        return title;
    }
    public String getStudio(){
        return studio;
    }
    public String getRating(){
        return rating;
    }
    public String toString() {
        return "The Movie is "+title+" produced by "+studio+", and its rated "+rating;
    }
}
