package week10;
public class Song {
    private String title;
    private String artist;
    private double duration;

    // Parameterized constructor
    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // Method to display the song's details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Duration: " + duration + " minutes");
    }

    public static void main(String[] args) {
        // Creating an object of the Song class using parameterized construct
}
