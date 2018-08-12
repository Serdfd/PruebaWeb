package com.proyecto.web.models;

public class SelectOption {
    private String value;
    private String text;

    public SelectOption() {
    }

    public SelectOption(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
