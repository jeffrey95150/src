package source;

public class NoteList extends LinkedList {
    public NoteList() {
        super(" ");
    }

    public Float average() {
        Float total = 0f;
        int count = 0;
        LinkedList current = this;
        while (current != null) {
            count++;
            total += (Float) current.content;
            current = current.next;
        }
        return total / count;
    }
}
