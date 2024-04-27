package Repositories;

import Models.Gate;

import java.util.HashMap;
import java.util.Optional;

public class GateRepository {
    private HashMap<Long, Gate> gates = new HashMap<>();

    public Optional<Gate> findbyGateId(Long id){
        return Optional.of(gates.get(id));
    }
}
