import cod.mvc.Coche;
import cod.mvc.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestModel {
    @Test
    public void crearCocheReturnTrue(){
        Assertions.assertNotNull(Model.crearCoche("matricula", "modelo", 20));
    }

    @Test
    public void getCocheAssertSameReturnTrue(){
        Coche coche = Model.crearCoche("matricula", "modelo", 20);
        Model.parking.add(coche);
        Assertions.assertEquals(Model.getCoche("matricula"), coche);
    }

    @Test
    public void cambiarVelocidadComprobarCambioReturnTrue(){
        Integer velocidad = 40;

    }
}
