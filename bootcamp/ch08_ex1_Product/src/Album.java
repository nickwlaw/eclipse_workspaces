public class Album extends Product {

    private String artist;

    public Album() {
        super();
        artist = "";
        count++;
    }

    public void setArtist(String author) {
        this.artist = author;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist;
    }
}
