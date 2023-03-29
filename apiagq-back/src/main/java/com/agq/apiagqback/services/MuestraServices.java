import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MuestraServices {

    @Autowired
    MuestraRepository muestraRepo;

    public ArrayList<Muestra> GetMuestras() {

    }
}
