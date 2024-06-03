//package org.epsi;
//
//
//import jakarta.persistence.*;
//import java.time.LocalDate;
//import java.util.Date;
//import java.util.List;
//import java.util.Set;
//
//@Entity
//@Table(name="Emprunt")
//public class Emprunt {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @Column(name="DATE_DEBUT")
//    private LocalDate dateDeDebut;
//
//    @Column(name="DATE_FIN")
//    private LocalDate dateFin;
//
//    @Column(name="DELAI")
//
//    private Integer delai;
//
//    @ManyToOne
//    @JoinColumn(name = "ID_CLIENT")
//    private Client client;
//
//
//    @ManyToMany
//    @JoinTable(
//            name = "COMPO",
//            joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"),
//            inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID")
//    )
//    private Set<Livre> livres;
//
//
//            public Emprunt() {
//    }
//
//    public Emprunt(Integer id, LocalDate dateDeDebut, LocalDate dateFin, Integer delai, Client client) {
//        this.id = id;
//        this.dateDeDebut = dateDeDebut;
//        this.dateFin = dateFin;
//        this.delai = delai;
//        this.client = client;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public LocalDate getDateDeDebut() {
//        return dateDeDebut;
//    }
//
//    public LocalDate getDateFin() {
//        return dateFin;
//    }
//
//    public Integer getDelai() {
//        return delai;
//    }
//
//    public Client getId_client() {
//        return client;
//    }
//
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public void setDateDeDebut(LocalDate dateDeDebut) {
//        this.dateDeDebut = dateDeDebut;
//    }
//
//    public void setDateFin(LocalDate dateFin) {
//        this.dateFin = dateFin;
//    }
//
//    public void setDelai(Integer delai) {
//        this.delai = delai;
//    }
//
//    public void setId_client(Client id_client) {
//        this.client = id_client;
//    }
//
//    @Override
//    public String toString() {
//        return "Emprunt{" +
//                "id=" + id +
//                ", dateDeDebut=" + dateDeDebut +
//                ", dateFin=" + dateFin +
//                ", delai=" + delai +
//                ", id_client=" + client +
//                '}';
//    }
//}
