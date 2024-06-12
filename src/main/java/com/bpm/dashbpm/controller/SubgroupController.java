package com.bpm.dashbpm.controller;
import java.text.Normalizer;
import com.bpm.dashbpm.entities.Subgroup;
import com.bpm.dashbpm.service.SubgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/subgroups")
public class SubgroupController {

    private final SubgroupService subgroupService;

    @Autowired
    public SubgroupController(SubgroupService subgroupService) {
        this.subgroupService = subgroupService;
    }

    @GetMapping("/by-cod-cidade/{codCidade}")
    public ResponseEntity<List<Subgroup>> getSubgroupsByCodCidade(@PathVariable Integer codCidade) {
        List<Subgroup> subgroups = subgroupService.getSubgroupsByCodCidade(codCidade);
        if (subgroups.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(subgroups);
    }


    @GetMapping("/by-idbase/{idbase}")
    public ResponseEntity<Subgroup> getSubgroupByidbase(@PathVariable Integer idbase) {
        Subgroup subgroup = subgroupService.getSubgroupByidbase(idbase);
        if (subgroup == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(subgroup);
    }


    @GetMapping("/by-base/{base}")
    public ResponseEntity<List<Subgroup>> getSubgroupsByBase(@PathVariable String base) {
        List<Subgroup> subgroups = subgroupService.getSubgroupsByBase(base);
        if (subgroups.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(subgroups);
    }

    ///////////


//    @GetMapping("/by-nome-cidade/{nomeCidade}")
//    public ResponseEntity<List<Subgroup>> getSubgroupsByNomeCidade(@PathVariable String nomeCidade) {
//        List<Subgroup> subgroups = subgroupService.getSubgroupsBynomeCidade(nomeCidade);
//        if (subgroups.isEmpty()) {
//            return ResponseEntity.noContent().build();
//        }
//        return ResponseEntity.ok(subgroups);
//    }



    @GetMapping("/by-nome-cidade/{nomeCidade}")
    public ResponseEntity<List<Subgroup>> getSubgroupsByNomeCidade(@PathVariable String nomeCidade) {
        String nomeCidadeSemAcentos = Normalizer.normalize(nomeCidade, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "");
        nomeCidadeSemAcentos = nomeCidadeSemAcentos.toUpperCase();
        System.out.println(nomeCidadeSemAcentos);
        List<Subgroup> subgroups = subgroupService.getSubgroupsBynomeCidade(nomeCidadeSemAcentos);
        if (subgroups.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(subgroups);
    }
}
