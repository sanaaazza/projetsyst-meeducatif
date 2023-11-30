package phase1;

public class Enseignant {
    private  String nom;
    private String prénom;
    private String email;
    private String grade;
    Département département;
    public Enseignant(String nom, String prénom,String email , String grade,Département département){
        this.nom=nom;
        this.prénom=prénom;
        this.email=email;
        this.grade=grade;
    }

    public String getNom() {
        return nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public String getEmail() {
        return email;
    }

    public String getGrade() {
        return grade;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                ", département=" + département +
                '}';
    }
}

