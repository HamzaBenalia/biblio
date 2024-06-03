package banque.entite;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("AssuranceVie")

public class AssuranceVie extends Compte {

    private LocalDateTime dateDeFin;

    private double taux;



    public LocalDateTime getDateDeFin() {
        return dateDeFin;
    }

    public double getTaux() {
        return taux;
    }

    public void setDateDeFin(LocalDateTime dateDeFin) {
        this.dateDeFin = dateDeFin;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
