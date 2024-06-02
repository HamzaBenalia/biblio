package org.epsi;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        // Créer EntityManagerFactory et EntityManager
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
//        EntityManager em = emf.createEntityManager();
//
//
//        try {
//            // Commencer une transaction
//            em.getTransaction().begin();
//
//            // Créer une requête JPQL pour sélectionner tous les livres avec leurs titres et auteurs
//            String jpql = "SELECT l.titre, l.auteur FROM Livre l";
//            List<Object[]> resultList = em.createQuery(jpql, Object[].class).getResultList();
//
//            // Afficher les titres et auteurs de tous les livres
//            if (!resultList.isEmpty()) {
//                System.out.println("Liste de tous les livres en base de données :");
//                for (Object[] result : resultList) {
//                    String titre = (String) result[0];
//                    String auteur = (String) result[1];
//                    System.out.println("Titre : " + titre + ", Auteur : " + auteur);
//                }
//            } else {
//                System.out.println("Aucun livre trouvé en base de données.");
//            }
//
//            // Valider la transaction
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            // En cas d'erreur, annuler la transaction et afficher l'erreur
//            if (em.getTransaction().isActive()) {
//                em.getTransaction().rollback();
//            }
//            e.printStackTrace();
//        }

    }
    }






