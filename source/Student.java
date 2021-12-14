package source;

public class Student {
    private final String name;
    private final NoteList notes;
    private int sum;

    Student(String name) {
        this.name = name;
        this.notes = new NoteList();
    }

    public NoteList getNotes() {
        return notes;
    }

    public void addNote(float note) {
        notes.append(note);
    }

    public Float getAverage() {
        return notes.average();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t%s", name, notes);
    }
}
