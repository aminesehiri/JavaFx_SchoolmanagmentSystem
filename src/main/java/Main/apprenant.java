package Main;
import java.time.LocalDate;


public class apprenant {
    private String nom ;
    private String prenom ;
    private String dateNaissance;

    private  String email ;

    private int id ;

    public apprenant(String nom ,String prenom , String dateNaissance , String email ){
        this.nom=nom ;
        this.prenom=prenom;
        this.dateNaissance=dateNaissance;
        this.id = generateUniqueId();

    }

    private boolean validatenom(String name) {
        return name.matches("[a-zA-Z']+") && name.length() >= 3;
    }
    private boolean validateEmail(String email) {
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }
    private int generateUniqueId() {

        return (int)(Math.random() * 1000000);

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (validatenom(nom)==true)
            this.nom = nom;
        else System.out.println("Le nom n'est pas valide");
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        if(validatenom(prenom)==true)
            this.prenom = prenom;
        else System.out.println("Le prenom n'est pas valide");
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(validateEmail(email)==true)
            this.email = email;
        else System.out.println("l'adresse email n'est pas valide");
    }

    public int getId() {
        return id;
    }


}
