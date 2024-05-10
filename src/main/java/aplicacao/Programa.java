package aplicacao;

import dominio.Celular;
import services.CelularService;
import services.CelularServiceIMPL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ex-jpa");
        EntityManager em = emf.createEntityManager();


        CelularService service = new CelularServiceIMPL();

        Celular novoCelular = new Celular();
        novoCelular.setArmazenamento(2512);
        novoCelular.setMarca("Epou");
        novoCelular.setRam(64);
        Celular celularCriado = service.create(novoCelular);

        System.out.println("Novo celular criado com ID: " + celularCriado.getId());
        System.out.println("Armazenamento: " + celularCriado.getArmazenamento());
        System.out.println("Marca: " + celularCriado.getMarca());
        System.out.println("Ram: " + celularCriado.getRam());

        List<Celular> celulares = service.findAll();
        for(Celular celular : celulares){
            System.out.println(celular.getMarca());
        }

        emf.close();
        em.close();
    }
}
