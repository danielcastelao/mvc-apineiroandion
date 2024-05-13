package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Observable;

public interface Observer {
    public void update(Coche coche);
}
