package ru.mastkey.randomfactapi.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.mastkey.randomfactapi.model.FactResponse;
import ru.mastkey.randomfactapi.service.FactService;

@RestController
public class FactController {
    private final FactService factService;

    @Autowired
    public FactController(FactService factService) {
        this.factService = factService;
    }

    @GetMapping("/fact")
    public FactResponse getFact(@PathParam("category") String category) {
        System.out.println(category);
        return factService.getFact(category);
    }

}
