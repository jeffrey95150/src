import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentList extends LinkedList {
    public StudentList() {
        super("\n");
    }

    public void load(File file, String et) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line;
        String[] fields;
        Student student;
        int j;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            fields = line.split("\\s{2,}");
            student = new Student(fields[0]);
            int moyenne = 0, sum = 0, count = 0;

            if(fields[0].contains(et)){
                //System.out.println("ok");
                //System.out.println(fields[0]); ok pour la liste des étudiants
                System.out.println("Voici l'étudiant et ses notes:");
                append(student);
                int moy = 0;
                //System.out.println("ok c'est ça");
                for (j = 1, count = 0; j < fields.length; j++) {
                    //System.out.print("ok c'est ça");
                    student.addNote.append(Float.parseFloat(fields[j]));
                }
            }
        }

        scanner.close();
    }

}
