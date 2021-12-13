public class Student {
    private String name;
    private NoteList notes;
    int moyenne = 0, count = 0;
    private int sum;

     Student(String name) {
        this.name = name;
        this.notes = new NoteList();
    }

    public NoteList getNotes() {
         /*System.out.println("note : ");
         sum += moy;*/
         System.out.println("moy: ");
         System.out.println(notes);
         return notes;
    }

    @Override
    public String toString() {
         return String.format("ok %s\n\t%s", name, notes);
    }
}
