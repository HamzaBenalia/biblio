package banque.entite;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="banque")
public class Banque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="Nom")
    private String nom;


    @OneToMany(mappedBy = "banque")
    private Set<Client> clients = new HashSet<>();

    public Banque() {
    }

    public Banque(String nom, Set<Client> clients) {

        this.nom = nom;
        this.clients = clients;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Banque{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
