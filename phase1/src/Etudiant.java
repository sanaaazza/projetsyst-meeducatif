import phase1.Filiere;

public class Etudiant {
    private String nom;
    private String email;
    private int apogée;
    private Filiere filière;
    public Etudiant(String nom, String email, int apogée , Filiere filière){
        this.nom=nom;
        this.email=email;
        this.apogée=apogée;
        this.filière=filière;
    }
    public String getNom(){
        return nom ;}

    public String getEmail() {
        return email;
    }

    public int getApogée() {
        return apogée;
    }

    public Filiere getFilière(){return filière;}

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApogée(int apogée) {
        this.apogée = apogée;
    }

    public void setFiliere(Filiere filière) {
        this.filière = filière;
    }

    @Override
    public String toString() {
        return "Étudiant{" +
                "nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", apogée=" + apogée +
                ", filière=" + filière +
                '}';
    }
}
