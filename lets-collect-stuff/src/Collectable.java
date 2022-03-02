public class Collectable {
    // Add collectable properties here
    private String albumName;
    private String artistName;
    private int numberOfSongs;
    private double value;

    // Add collectable constructors here
    public Collectable() {
    }

    public Collectable(String albumName, String artistName, int numberOfSongs, double value) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.numberOfSongs = numberOfSongs;
        this.value = value;
    }

    // Add collectable accessors and mutators here
    public String getAlbumName() {
        return this.albumName;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public int getNumberOfSongs() {
        return this.numberOfSongs;
    }

    public double getValue() {
        return this.value;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public void setValue(double value) {
        this.value = value;
    }
    // Add any methods here

    public String toString() {
        return "The album name is " + this.albumName + ". The artist is named " + this.artistName
                + ". The number of songs is " +
                this.numberOfSongs + ". The value of the album is " + this.value +
                " dollars." + "\n";
    }

    public static boolean checkEqual(Collectable first, Collectable second) {
        if (first.getAlbumName() == second.getAlbumName() && first.getArtistName() == second.getArtistName()
                && first.getValue() == second.getValue() && first.getNumberOfSongs() == second.getNumberOfSongs()) {
            return true;
        } else {
            return false;
        }

    }

}