package banque.entite;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity

public class Virement extends Operation {

    private String beneficiaire;

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}
