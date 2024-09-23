package Lists_Iterator_Autoboxing.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        // Returns true if the song was added successfully or false otherwise.
        if (findSong(title) != null) {
            return false;
        }
        return songs.add(new Song(title, duration));
    }

    private Song findSong(String title) {
        // Returns a Song. Returns the Song if it exists, null if it doesn't exist.
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int track, LinkedList<Song> playlist) {
        // Returns true if it exists and was added successfully
        // using the track number, or false otherwise.
        int index = track - 1;
        if (index >= 0 && index <= songs.size()) {
            playlist.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        // Returns true if it exists and was added successfully using the name of
        // the song, or false otherwise.
        Song song = findSong(title);
        if (song == null) {
            return false;
        }
        return playlist.add(song);
    }
}
