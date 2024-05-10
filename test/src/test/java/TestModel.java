import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestModel {
    @Test
    public void crearCocheReturnTrue(){
        Model model = new Model();
        Assertions.assertNotNull(model.crearCoche("matricula", "modelo", 20));
    }

    @Test
    public void cambiarVelocidadComprobarCambioReturnTrue(){
        Model model = new Model();
        Coche coche = model.crearCoche("matricula", "modelo", 20);
        Integer velocidad = 40;
        model.parking.add(coche);
        model.cambiarVelocidad("matricula", velocidad);
        Assertions.assertEquals(velocidad, coche.getVelocidad());

    }
    @Test
    public void comprobarAddCocheIntoParkingReturnTrue(){
        Model model = new Model();
        Coche coche = model.crearCoche("matricula", "modelo", 20);
        Assertions.assertTrue(model.addCoche(coche));
    }

}
