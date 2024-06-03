import cod.mvc.controller.Controller;
import cod.mvc.model.Model;
import cod.mvc.view.View;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
/**
 * Esta clase se usa para los test de los metodos del controller
 */
public class TestController {
    /**
     * Test que comprueba el metodo subirVelocidad
     */
    @Test
    public void testSubirVelocidadReturnTrue(){
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        Assertions.assertTrue(controller.subirVelocidad("123456", 10));
    }
    /**
     * Test que comprueba que el metodo subirVelocidad devuelve false si el coche no existe
     */
    @Test
    public void testSubirVelocidadNullCarReturnFalse(){
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        Assertions.assertFalse(controller.subirVelocidad("asdfg", 10));
    }
    /**
     * Test que comprueba el metodo bajarVelocidad
     */
    @Test
    public void testBajarVelocidadReturnTrue(){
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        Assertions.assertTrue(controller.bajarVelocidad("123456", 10));
    }
    /**
     * Test que comprueba que el metodo bajarVelocidad devuelve false si el coche no existe
     */
    @Test
    public void testBajarVelocidadNullCarReturnFalse(){
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        Assertions.assertFalse(controller.bajarVelocidad("asdfg", 10));
    }
}
