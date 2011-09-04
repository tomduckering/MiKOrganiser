package duckering.MiKOrganiser;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by IntelliJ IDEA.
 * User: tomduckering
 * Date: 04/09/2011
 * Time: 12:42
 * To change this template use File | Settings | File Templates.
 */
public class Song {
    private int id;
    private URI path;
    private String pitch;
    private String first_key;
    private String second_key;
    private double probability;
    private double tempo;
    private double volume;
    private String analysis_date;


    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public URI getPath() {
        return path;
    }

    public void setPath(String path) throws URISyntaxException {
        this.path = new URI(path);
    }

    public String getFirst_key() {
        return first_key;
    }

    public void setFirst_key(String first_key) {
        this.first_key = first_key;
    }

    public String getSecond_key() {
        return second_key;
    }

    public void setSecond_key(String second_key) {
        this.second_key = second_key;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getAnalysis_date() {
        return analysis_date;
    }

    public void setAnalysis_date(String analysis_date) {
        this.analysis_date = analysis_date;
    }
}
