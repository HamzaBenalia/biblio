package org.epsi;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class TestBibliotheque {


    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
        EntityManager em = emf.createEntityManager();

        // Réaliser une requête qui permet d’extraire un emprunt et tous ses livres associés
        extractEmpruntWithLivres(em);

        // Fermer EntityManager et EntityManagerFactory
        em.close();
        emf.close();
    }

    private static void extractEmpruntWithLivres(EntityManager em) {
        // ID de l'emprunt à rechercher
        Long empruntId = 1L;

        // Réaliser une requête JPQL pour extraire un emprunt et tous ses livres associés
        String jpql = "SELECT e FROM Emprunt e JOIN FETCH e.livres WHERE e.id = :empruntId";

        // Exécuter la requête
        List<Emprunt> emprunts = em.createQuery(jpql, Emprunt.class)
                .setParameter("empruntId", empruntId)
                .getResultList();

        // Vérifier si un emprunt a été trouvé
        if (!emprunts.isEmpty()) {
            Emprunt emprunt = emprunts.get(0);
            System.out.println("Emprunt trouvé : " + emprunt);
            System.out.println("Livres associés à l'emprunt :");

    }

    }
}