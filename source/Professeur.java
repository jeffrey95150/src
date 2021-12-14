package source;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Professeur extends LinkedList {

    private String name;
    private Object Professeur;

    public Professeur(String field) {
        super("\n");
    }

    public String[] getList(String[] fields) {
        return fields;
    }

    public void load(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line;
        String[] fields;
        Professeur professeur;
        int j;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            fields = line.split("\t");
            professeur = new Professeur(fields[0]);

            if (fields[0].contains("#")) {
                //System.out.println("ok");
                //System.out.println(fields[0]); ok pour la liste des étudiants
                append(professeur);
                for (j = 1; j < fields.length; j++) {
                    //professeur.getList(fields[j]);
                }
            }
        }

        scanner.close();
    }
}
