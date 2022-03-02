import java.util.ArrayList;
import java.util.List;

public class CollectionClient {
    public static void main(String[] args) throws Exception {
        // Add your collection ArrayList here..
        // e.g. List<Collectable> collection = new ArrayList<Collectable>();
        List<Collectable> collectables = new ArrayList<Collectable>();
        // Add collection methods here to manage and manipulate the collection
        Collectable album0 = new Collectable("OK Orchestra", "AJR", 16, 20.0);
        Collectable album1 = new Collectable("Give Me Your Shoulder", "half-alive", 7, 12.5);
        Collectable album2 = new Collectable("Now, Not Yet", "half-alive", 12, 10.0);
        Collectable album3 = new Collectable("Give Me The Future", "Bastille", 13, 15.0);
        Collectable album4 = new Collectable("Ghoul", "Ghoul-Men", 400, 0.02);
        collectables.add(album0);
        collectables.add(album3);
        collectables.add(album2);
        collectables.add(album1);
        collectables.add(album4);
        collectables.remove(4);
        System.out.println(collectables);
        for (int i = 0; i < collectables.size(); i++) {
            if (collectables.get(i).getArtistName() == "half-alive") {
                System.out.print("Album ");
                System.out.print(i + 1);
                System.out.println(" is made by half-alive");
            }
        }
        System.out.print("The total number of albums in the collection is ");
        System.out.println(collectables.size());
        System.out.println(collectables.get(0).getValue());

        rearrange(collectables);
        System.out.println(collectables);
    }

    public static void rearrange(List<Collectable> collectables) {
        for (int j = 0; j < collectables.size() - 1; j++) {
            List<Collectable> temp = new ArrayList<Collectable>();
            if (collectables.get(j).getNumberOfSongs() > collectables.get(j + 1).getNumberOfSongs()) {
                temp.add(collectables.get(j));
                collectables.remove(j);
                collectables.add(j, collectables.get(j));
                collectables.remove(j + 1);
                collectables.add(j + 1, temp.get(0));
                rearrange(collectables);
            }
        }
    }
}
