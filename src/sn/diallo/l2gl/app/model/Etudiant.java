package sn.diallo.l2gl.app.model;

public class Etudiant {

    private String matricule;
    private String nom;

    public Etudiant(String matricule, String nom) {

        if (matricule == null || matricule.isBlank()) {
            throw new IllegalArgumentException("Matricule invalide");
        }

        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Nom invalide");
        }

        this.matricule = matricule;
        this.nom = nom;
    }

    public Etudiant(String matricule) {
        this(matricule, "Inconnu");
    }


    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Nom invalide");
        }
        this.nom = nom;
    }

    public void afficher() {
        System.out.println(matricule + " - " + nom);
    }
}
