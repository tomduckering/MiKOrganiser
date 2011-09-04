package duckering.MiKOrganiser;

/**
 * Created by IntelliJ IDEA.
 * User: tomduckering
 * Date: 04/09/2011
 * Time: 12:46
 * To change this template use File | Settings | File Templates.
 */
public class SongId {
    private int id;

    public SongId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return ""+id;
    }
}
