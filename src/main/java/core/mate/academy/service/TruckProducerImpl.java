package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        ArrayList<Truck> list = new ArrayList<>();
        list.add(new Truck());
        list.add(new Truck());
        list.add(new Truck());
        return list;
    }
}
