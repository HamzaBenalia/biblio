package banque.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity

public class LivretA extends Compte {

    private double taux;

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
