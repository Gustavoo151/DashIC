package com.bpm.dashbpm.service;

import com.bpm.dashbpm.entities.Subgroup;
import com.bpm.dashbpm.repository.SubgroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubgroupService {

    private final SubgroupRepository subgroupRepository;

    @Autowired
    public SubgroupService(SubgroupRepository subgroupRepository) {
        this.subgroupRepository = subgroupRepository;
    }

    public List<Subgroup> getSubgroupsByCodCidade(Integer codCidade) {
        return subgroupRepository.findByCodCidade(codCidade);
    }

    public Subgroup getSubgroupByidbase(Integer idbase) {
        return subgroupRepository.findByIdbase(idbase);
    }

    public List<Subgroup> findAll() {
        return subgroupRepository.findAll();
    }

    public List<Subgroup> getSubgroupsByBase(String base) {
        return subgroupRepository.findByBase(base);
    }
//
    public List<Subgroup> getSubgroupsBynomeCidade(String nomeCidade) {
        return subgroupRepository.findBynomeCidade(nomeCidade);
    }

}
