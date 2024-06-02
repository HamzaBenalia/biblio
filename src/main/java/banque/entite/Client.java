package banque.entite;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Nom")
    private String nom;

    @Column(name="Prenom")
    private String prenom;

    @Column(name="Date_De_Naissance")
    private LocalDate dateNaissance;

    @Embedded
    public Adresse adresse;

    @ManyToMany(mappedBy = "clients")
    private Set<Compte> comptes = new HashSet<>();

    @ManyToOne
    @JoinColumn(name="banque_id")
    private Banque banque;



    public Client() {
    }

    public Client(Integer id, String nom, String prenom, LocalDate dateNaissance, Adresse adresse, Set<Compte> comptes, Banque banque) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.comptes = comptes;
        this.banque = banque;
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Set<Compte> getComptes() {
        return comptes;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setComptes(Set<Compte> comptes) {
        this.comptes = comptes;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", adresse=" + adresse +
                ", comptes=" + comptes +
                ", banque=" + banque +
                '}';
    }
}
