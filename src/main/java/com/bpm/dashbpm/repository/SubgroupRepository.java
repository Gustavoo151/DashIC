package com.bpm.dashbpm.repository;

import com.bpm.dashbpm.entities.Subgroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubgroupRepository extends JpaRepository<Subgroup, Integer> {
        List<Subgroup> findByCodCidade(Integer codCidade);
        List<Subgroup> findAll();
        Subgroup findByIdbase(Integer idbase);
        List<Subgroup> findByBase(String base);
        List<Subgroup> findBynomeCidade(String nomeCidade);

}
