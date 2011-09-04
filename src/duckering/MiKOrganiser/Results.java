package duckering.MiKOrganiser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: tomduckering
 * Date: 04/09/2011
 * Time: 12:40
 * To change this template use File | Settings | File Templates.
 */
public class Results {
    private String id;
    private String creation_date;
    private ArrayList<Song> songs = new ArrayList<Song>();
    private ArrayList<SongCollection> collections = new ArrayList<SongCollection>();


    private String version;
    private String xmlns;


    public String getId() {
        return id;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public ArrayList<SongCollection> getCollections() {
        return collections;
    }

    public SongCollection findOrMakeCollection(String collectionNameThatWeAreLookingFor) {

        for (SongCollection collection : collections) {
            System.err.println(collection.getName());
            System.err.println(collectionNameThatWeAreLookingFor);
            if (collection.getName().equals(collectionNameThatWeAreLookingFor)) {
                return collection;
            }
        }
        System.out.println("Creating new collection called: "+collectionNameThatWeAreLookingFor);
        SongCollection collection = new SongCollection(collectionNameThatWeAreLookingFor);

        collections.add(collection);

        return collection;

    }
}
