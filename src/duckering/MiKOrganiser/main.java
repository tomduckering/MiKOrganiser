package duckering.MiKOrganiser;

import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: tomduckering
 * Date: 04/09/2011
 * Time: 12:39
 * To change this template use File | Settings | File Templates.
 */
public class main {

    static XStream xStream = new XStream();
    static String commonPath = "file://localhost/Volumes/PORSCHE/Tracks/";


    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {


        xStream.alias("results",Results.class);
        xStream.useAttributeFor(Results.class,"version");
        xStream.useAttributeFor(Results.class,"xmlns");


        xStream.alias("collections", List.class);
        xStream.alias("collection",SongCollection.class);

        xStream.addImplicitCollection(SongCollection.class,"song_ids");

        xStream.alias("song_id",Integer.class);
        //xStream.aliasField("int",SongCollection.class,"song_id");



        xStream.alias("song",Song.class);
        xStream.useAttributeFor(Song.class,"id");

        Results results = (Results)xStream.fromXML(new File(args[0]));

        URLDecoder decoder = new URLDecoder();


        System.out.println(results.getSongs().size());
        System.out.println(results.getCollections().size());

        for (Song song:results.getSongs()) {
            System.out.println(song.getPath().getPath());

            String pathWithoutCommonPrefix = song.getPath().toString().substring(commonPath.length());
            System.out.println(pathWithoutCommonPrefix);

            int endOfFirstPathElement = pathWithoutCommonPrefix.indexOf("/");

            String firstPathElement = pathWithoutCommonPrefix.substring(0,endOfFirstPathElement);

            String collectionName = URLDecoder.decode(firstPathElement,"UTF-8");


            SongCollection collection = results.findOrMakeCollection(collectionName);

            collection.addSongId(song.getId());

        }

        xStream.toXML(results, new FileOutputStream(args[0]+".new"));

    }



}
