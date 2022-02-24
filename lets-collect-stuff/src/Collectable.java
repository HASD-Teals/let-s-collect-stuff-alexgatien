public class Collectable {
    // Add collectable properties here
    private String albumName;
    private String artistName;
    private int levelofDamage;
    private double value;

    // Add collectable constructors here
    public Collectable() {
    }

    public Collectable(String albumName, String artistName, int levelofDamage, double value) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.levelofDamage = levelofDamage;
        this.value = value;
    }

    // Add collectable accessors and mutators here
    public String getAlbumName() {
        return this.albumName;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public int getLevelOfDamage() {
        return this.levelofDamage;
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

    public void setLevelOfDamage(int levelOfDamage) {
        this.levelofDamage = levelOfDamage;
    }

    public void setValue(double value) {
        this.value = value;
    }
    // Add any methods here

    public String toString() {
        return "The album name is " + this.albumName + ". The artist is named" + this.artistName
                + ". The level of damage out of 10 is" +
                this.levelofDamage + ". The value of the album is " + this.value +
                "dollars.";
    }

    public static boolean checkEqual(Collectable first, Collectable second) {
        if (first.getAlbumName() == second.getAlbumName() && first.getArtistName() == second.getArtistName()
                && first.getValue() == second.getValue() && first.getLevelOfDamage() == first.getLevelOfDamage()) {
            return true;
        } else {
            return false;
        }

    }

}