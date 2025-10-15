package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        ArrayList<Excavator> list = new ArrayList<>();
        list.add(new Excavator());
        list.add(new Excavator());
        list.add(new Excavator());
        return list;
    }
}
