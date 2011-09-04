package duckering.MiKOrganiser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: tomduckering
 * Date: 04/09/2011
 * Time: 12:45
 * To change this template use File | Settings | File Templates.
 */
public class SongCollection {

    private int type;
    private String name;
    private List<Integer> song_ids = new ArrayList<Integer>();

    public String getName() {
        return name;
    }

    public SongCollection( String name) {
        this.type = 0; //Default type is 0 - no idea what it does.
        this.name = name;
    }

    public void addSongId(Integer songId) {
        song_ids.add(songId);
    }
}
