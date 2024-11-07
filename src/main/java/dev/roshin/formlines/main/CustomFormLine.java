package dev.roshin.formlines.main;

import dev.roshin.formlines.FormLine;

// CustomFormLine.java
public class CustomFormLine extends FormLine {
    private String additionalProperty;

    // Constructors
    public CustomFormLine() {
        super();
    }

    // Getters and Setters
    public String getAdditionalProperty() {
        return additionalProperty;
    }

    public void setAdditionalProperty(String additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    // Additional methods or overrides
    // ...
}
