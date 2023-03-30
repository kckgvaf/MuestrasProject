import org.springframework.stereotype.Repository;

@Repository
public interface MuestraRepository extends JpaRepository<Muestra, Long>
{

    Muestra findByIdMuestra(int idMuestra);

    Muestra findByCodMuestra(String CodMuestra);

}