public class Song {

    String title;
    String artist;
    double length;

    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public Song(){
        this.title = "El Pibe De Mi Barrio";
        this.artist = "Dr. Krapula";
        this.length = 2.47;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getLength() {
        return length;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        String string;
        string = title + ", artist: " + artist + ", length: " + length;
        return string;
    }


}
