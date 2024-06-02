package banque.entite;

import jakarta.persistence.Embeddable;
@Embeddable
public class Adresse {

    private Integer numero;
    private String rue;
    private Integer codePostale;
    private String ville;

    public Adresse() {
    }

    public Adresse(Integer numero, String rue, Integer codePostale, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codePostale = codePostale;
        this.ville = ville;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getRue() {
        return rue;
    }

    public Integer getCodePostale() {
        return codePostale;
    }

    public String getVille() {
        return ville;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setCodePostale(Integer codePostale) {
        this.codePostale = codePostale;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "numero=" + numero +
                ", rue='" + rue + '\'' +
                ", codePostale=" + codePostale +
                ", ville='" + ville + '\'' +
                '}';
    }
}
