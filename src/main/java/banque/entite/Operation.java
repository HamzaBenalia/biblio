package banque.entite;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="operation")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Column(name="Date")
    private LocalDateTime date;

    @Column(name="Montant")
    private Double montant;


    @Column(name="Motif")
    private String motif;

    public Operation() {
    }

    public Operation(int id, LocalDateTime date, Double montant, String motif) {
        this.id = id;
        this.date = date;
        this.montant = montant;
        this.motif = motif;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Double getMontant() {
        return montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    @ManyToOne
    @JoinColumn(name = "compte_id")
    private Compte compte;

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", date=" + date +
                ", montant=" + montant +
                ", motif='" + motif + '\'' +
                '}';
    }
}
