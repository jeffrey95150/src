import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        StudentList studentList = new StudentList();
        //Professeur professeur = new Professeur(fields[0]);
        File file = new File("data.txt");

        Menu menu = new Menu(2);
        Menu.Afficher();
        System.out.println(menu);
        Scanner scan = new Scanner(System.in);

        switch ( scan.nextInt() ) {
            case 1:
                try {
                    //studentList.load(file, );
                    System.out.println("Etudiant>");
                    Scanner etudiant = new Scanner(System.in);
                    String et = etudiant.nextLine();
                    studentList.load(file, et);
                    System.out.println(studentList);
                } catch (FileNotFoundException e) {
                    System.out.print("Fichier introuvable");
                }
                break;
            case 2:
                System.out.println ( "You picked option 2" );
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
        /*StudentList studentList = new StudentList();
        File file = new File("data.txt");
        try {
            studentList.load(file);
            System.out.println(studentList);
        } catch (FileNotFoundException e) {
            System.out.print("Fichier introuvable");
        }*/
    }
}
