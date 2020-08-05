package kevinlearnspring_petClinic.services;

import kevinlearnspring_petClinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}

