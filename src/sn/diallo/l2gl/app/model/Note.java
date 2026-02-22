package sn.diallo.l2gl.app.model;

public class Note {

    private Etudiant etudiant;
    private Module module;
    private double valeur;

    public Note(Etudiant e, Module m, double valeur) {

        if (e == null) {
            throw new IllegalArgumentException("Etudiant null interdit");
        }

        if (m == null) {
            throw new IllegalArgumentException("Module null interdit");
        }

        if (valeur < 0 || valeur > 20) {
            throw new IllegalArgumentException("La note doit être entre 0 et 20");
        }

        this.etudiant = e;
        this.module = m;
        this.valeur = valeur;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Module getModule() {
        return module;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        if (valeur < 0 || valeur > 20) {
            throw new IllegalArgumentException("La note doit être entre 0 et 20");
        }
        this.valeur = valeur;
    }

    
    public double points() {
        return valeur * module.getCoefficient();
    }

    @Override
    public String toString() {
        return "Note{etudiant=" + etudiant.getMatricule() +
                ", module=" + module.getCode() +
                ", valeur=" + valeur +
                ", points=" + points() + "}";
    }
}
