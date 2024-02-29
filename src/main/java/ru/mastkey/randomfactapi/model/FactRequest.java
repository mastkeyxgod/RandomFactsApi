package ru.mastkey.randomfactapi.model;

public class FactRequest {
    private String category;

    public FactRequest(String category) {
        this.category = category;
    }

    public FactRequest() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
