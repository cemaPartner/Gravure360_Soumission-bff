package com.gravure360.gravure360soumission.controller;

import com.gravure360.gravure360soumission.gateway.ColorGateway;
import com.gravure360.gravure360soumission.model.Color;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/color")
public class ColorControlller {

    private final ColorGateway colorGateway;

    public ColorControlller(ColorGateway colorGateway) {
        this.colorGateway = colorGateway;
    }

    @GetMapping("/get")
    public List<Color> getColors() {
        return colorGateway.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<List<Color>> addColor(@RequestBody Color color) {
        colorGateway.save(color);

        return new ResponseEntity<>(colorGateway.findAll(), HttpStatus.CREATED);
    }
}
