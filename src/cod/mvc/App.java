package cod.mvc;

/**
 * Clase App que inicia el programa y pasa el control al controller
 */
public class App {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.updateView();
    }
}