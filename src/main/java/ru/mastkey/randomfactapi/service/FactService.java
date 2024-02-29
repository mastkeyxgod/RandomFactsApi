package ru.mastkey.randomfactapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mastkey.randomfactapi.model.FactResponse;
import ru.mastkey.randomfactapi.util.FactsGenerator;

@Service
public class FactService {

    private final FactsGenerator factsGenerator;

    @Autowired
    public FactService(FactsGenerator chat) {
        this.factsGenerator = chat;
    }

    public FactResponse getFact(String category) {
        if (category == null || category.isEmpty()) {
            category = "Забавные факты";
        }
        String fact = factsGenerator.getChat(category);
        return new FactResponse(fact);
    }
}
