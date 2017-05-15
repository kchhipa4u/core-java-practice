/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author kc211701
 */
public class Jukebox1 {

    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String a[]) {
        new Jukebox1().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
    }



    private void getSongs() {
        try{
            File file = new File("SongList");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line= reader.readLine())!=null){
                addSong(line);
            }
        }
        catch(Exception e){
           e.printStackTrace();
        }
    }

    private void addSong(String lineToParse) {
        String[] tokens= lineToParse.split("/");
        songList.add(tokens[0]);
    }
}