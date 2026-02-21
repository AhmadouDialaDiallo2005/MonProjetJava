package sn.diallo.l2gl.app;

import sn.diallo.l2gl.app.model.Etudiant;
import sn.diallo.l2gl.app.model.Module;
import sn.diallo.l2gl.app.model.Note;



public class Main {
    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("2026-001", "Awa");
        Etudiant e2 = new Etudiant("2026-002");

        e1.afficher();
        e2.afficher();

        Module m1 = new Module("JAVA", "Programmation Java", 2.0);
        Module m2 = new Module("ALGO", "Algorithme");

        System.out.println(m1);
        System.out.println(m2);


        Note n1 = new Note(e1, m1, 17.5);
        System.out.println(n1);
        System.out.println("Points = " + n1.points());


        Note n2 = new Note(e1, m1, 25);

    }
}
