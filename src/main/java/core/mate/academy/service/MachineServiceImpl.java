package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> p;
        List<? extends Machine> list;

        if (type == Bulldozer.class) {
            p = new BulldozerProducerImpl();
            list = p.get();
            return (List<T>) list;
        } else if (type == Truck.class) {
            p = new TruckProducerImpl();
            list = p.get();
            return (List<T>) list;
        } else if (type == Excavator.class) {
            p = new ExcavatorProducerImpl();
            list = p.get();
            return (List<T>) list;
        }
        return List.of();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
