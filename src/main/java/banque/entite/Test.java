package banque.entite;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Test {


    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
        EntityManager em = emf.createEntityManager();

            em.getTransaction().begin();

            Compte compte1 = new Compte();
            compte1.setNumero("2");
            compte1.setSold(200.00);
            em.persist(compte1);

            Client client1 = new Client();
            client1.setNom("Hamza");
            client1.setComptes(new HashSet<>());
            client1.getComptes().add(compte1);
            em.persist(client1);

            Client client2 = new Client();
            client2.setNom("Eryan");
            client2.setComptes(new HashSet<>());
            client2.getComptes().add(compte1);
            em.persist(client2);


            AssuranceVie assuranceVie = new AssuranceVie();

            assuranceVie.setTaux(0.5);
            assuranceVie.setDateDeFin(LocalDateTime.now());

            em.persist(assuranceVie);

            LivretA livretA = new LivretA();
            livretA.setTaux(0.3);
            em.persist(livretA);

            Client client3 = new Client();
            client3.setComptes(new HashSet<>());
            client3.getComptes().add(livretA);
            client3.getComptes().add(assuranceVie);
            em.persist(client3);

            em.getTransaction().commit();

            em.close();
            emf.close();




    }
}
