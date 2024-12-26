package com.gravure360.gravure360soumission.controller;

import com.gravure360.gravure360soumission.gateway.MaterialGateway;
import com.gravure360.gravure360soumission.model.Material;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaterialController {

    private final MaterialGateway materialGateway;

    public MaterialController(MaterialGateway materialGateway) {
        this.materialGateway = materialGateway;
    }

    @GetMapping("/materials/get")
    public List<Material> getMaterials() {
        return materialGateway.findAll();
    }

    @PostMapping("/material/add")
    public ResponseEntity<List<Material>> addMaterial(@RequestBody Material material) {
        materialGateway.save(material);

        return new ResponseEntity<>(materialGateway.findAll(), HttpStatus.CREATED);
    }
}
