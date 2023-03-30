import Models.Muestra;
import Repositories.MuestraRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;


@DataJpaTest
public class myUnitTest {



    @Autowired
    MuestraRepository muestraRepo;

    @Test
    public void findMuestraByIdTest()
    {

        /*
            Tutorial tut1 = new Tutorial("Tut#1", "Desc#1", true);
            entityManager.persist(tut1);

            Tutorial tut2 = new Tutorial("Tut#2", "Desc#2", false);
            entityManager.persist(tut2);

            Tutorial tut3 = new Tutorial("Tut#3", "Desc#3", true);
            entityManager.persist(tut3);

            Iterable<Tutorial> tutorials = repository.findByPublished(true);

            assertThat(tutorials).hasSize(2).contains(tut1, tut3);

        * */

        //(String codMuestra, String tipoMuestra, String empresa, Date fechaCrDate)

        Muestra m = new Muestra("A-22/00001", "Vegetal", "AGQ");


        Muestra encontrada = muestraRepo.findByCodMuestra("A-22/00001");


    }
}
