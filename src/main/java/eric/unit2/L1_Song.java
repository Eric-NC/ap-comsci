package eric.unit2;

/*
 Write a java code to create jukebox that can search (you don't need to code the search part) 
 songs by artist, genre , title, album, duration in� seconds, language, beats per minutes (BPM)
 
 
 Hint: You dont need a starting point, any output, or the code for searching
 */

@SuppressWarnings("unused")
class Song {
    private String artist;
    private String genre;
    private String title;
    private String album;
    private String language;
    private int duration;
    private int bpm;

    public static Song search(String artist, String genre, String title, String album, String language, int duration, int bpm) {
        throw new UnsupportedOperationException();
    }

    public Song(String artist, String genre, String title, String album, String language, int duration, int bpm) {
        this.artist = artist;
        this.genre = genre;
        this.title = title;
        this.album = album;
        this.language = language;
        this.duration = duration;
        this.bpm = bpm;
    }
}
