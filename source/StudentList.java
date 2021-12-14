package source;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentList extends LinkedList {
    public StudentList() {
        super("\n");
    }

    public void load(File file, String studentName) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line;
        String[] fields;
        Student student;
        int j;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            fields = line.split("\\s{2,}");
            student = new Student(fields[0]);
            if (fields[0].contains(studentName)) {
                System.out.println("Voici l'étudiant et ses notes :");
                append(student);
                for (j = 1; j < fields.length; j++) {
                    student.addNote(Float.parseFloat(fields[j]));
                }
                System.out.println(student.getName());
                System.out.println("Notes : " + student.getNotes());
                System.out.println("Moyenne : " + student.getAverage());
            }
        }

        scanner.close();
    }

}
