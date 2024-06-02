package banque.entite;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="compte")
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private int id;

    @Column(name="Numero")
    private String numero;

    @Column(name="Sold")
    private Double sold;


    @ManyToMany
    @JoinTable(
            name = "client_compte",
            joinColumns = @JoinColumn(name = "compte_id"),
            inverseJoinColumns = @JoinColumn(name = "client_id")
    )
    private Set<Client> clients = new HashSet<>();


    @OneToMany(mappedBy = "compte", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Operation> operations = new HashSet<>();


    public Compte() {
    }

    public Compte(int id, String numero, Double sold, Set<Client> client, Set<Operation> operations) {
        this.id = id;
        this.numero = numero;
        this.sold = sold;
        this.clients = client;
        this.operations = operations;
    }

    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSold() {
        return sold;
    }

    public Set<Client> getClient() {
        return clients;
    }

    public Set<Operation> getOperations() {
        return operations;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSold(Double sold) {
        this.sold = sold;
    }

    public void setClient(Set<Client> client) {
        this.clients = client;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", sold=" + sold +
                ", client=" + clients +
                ", operations=" + operations +
                '}';
    }
}
