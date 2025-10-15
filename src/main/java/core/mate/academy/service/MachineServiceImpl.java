package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        if (type.equals(Bulldozer.class)) {
            machines = new BulldozerProducerImpl().get();
            return (List<T>) machines;
        }
        if (type.equals(Truck.class)) {
            machines = new TruckProducerImpl().get();
            return (List<T>) machines;
        }
        if (type.equals(Excavator.class)) {
            machines = new ExcavatorProducerImpl().get();
            return (List<T>) machines;
        }
        return Collections.emptyList();
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
