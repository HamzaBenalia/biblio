package org.epsi;

import banque.entite.Adresse;
import banque.entite.Banque;
import banque.entite.Client;
import banque.entite.Compte;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;


public class TestBibliotheque {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // Création d'une adresse
            Adresse adresse = new Adresse();
            adresse.setRue("lolo");
            adresse.setNumero(15);
            adresse.setCodePostale(34000);
            adresse.setVille("Montpellier");

            // Création d'une banque
            Banque banque = new Banque();
            banque.setNom("LCL");

            // Création d'un client
            Client client = new Client();
            client.setNom("ben");
            client.setDateNaissance(LocalDate.now());
            client.setAdresse(adresse); // Associer l'adresse au client

            // Création d'un compte
            Compte compte = new Compte();
            compte.setSold(100.0);
            compte.setNumero("1");

            // Associer le client au compte

            // Persister les entités
            em.persist(banque);
            em.persist(client);
            em.persist(compte);

            em.getTransaction().commit();

            System.out.println("Données persistées avec succès !");
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
