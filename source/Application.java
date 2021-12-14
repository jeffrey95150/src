package source;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        StudentList studentList = new StudentList();
        //source.Professeur professeur = new source.Professeur(fields[0]);
        File file = new File("data.txt");

        Menu.display();
        Scanner scan = new Scanner(System.in);

        switch (scan.nextInt()) {
            case 1:
                try {
                    //studentList.load(file, );
                    System.out.print("Nom de l'étudiant > ");
                    Scanner studentNameScanner = new Scanner(System.in);
                    String studentName = studentNameScanner.nextLine();
                    studentList.load(file, studentName);
                } catch (FileNotFoundException e) {
                    System.out.print("Fichier introuvable");
                }
                break;
            case 2:
                System.out.println("You picked option 2");
                break;
            case 3:
                /*try {
                    professeur.load(file);
                    System.out.println(studentList);
                } catch (FileNotFoundException e) {
                    System.out.print("Fichier introuvable");
                }*/
                break;
            case 4:
                break;
        }
        /*source.StudentList studentList = new source.StudentList();
        File file = new File("data.txt");
        try {
            studentList.load(file);
            System.out.println(studentList);
        } catch (FileNotFoundException e) {
            System.out.print("Fichier introuvable");
        }*/
    }
}
