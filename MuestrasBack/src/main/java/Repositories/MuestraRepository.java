package Repositories;

import Models.Muestra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MuestraRepository extends JpaRepository<Muestra, Long>
{

    Muestra findByIdMuestra(int idMuestra);

    Muestra findByCodMuestra(String CodMuestra);

    List<Muestra> findAll();

}