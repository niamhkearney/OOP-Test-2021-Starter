package ie.tudublin;

public class Note {

    private char note;
    private int duration;
    private String name;

    public Note(String name) {
        this.name = name;
    }

    public String toString() {
        return name = note + " " + duration;
    }

    public char getNote() {
        return note;
    }

    public void setNote(char note) {
        this.note = note;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration() {
        this.duration = duration;
    }

}
