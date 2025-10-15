package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        ArrayList<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer());
        list.add(new Bulldozer());
        list.add(new Bulldozer());
        return list;
    }
}
