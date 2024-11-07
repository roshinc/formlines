package dev.roshin.formlines;

import java.util.List;

/**
 * The FormLine class is a representation of a formline within a formlines.
 * <p>
 * Subclasses can extend this class to provide specific behaviors for different types of form lines.
 */
public class FormLine {
    private String type;
    private String template;
    private FormLineDescription lineDescription;
    private List<FormLineValue> lineValues;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public FormLineDescription getLineDescription() {
        return lineDescription;
    }

    public void setLineDescription(FormLineDescription lineDescription) {
        this.lineDescription = lineDescription;
    }

    public List<FormLineValue> getLineValues() {
        return lineValues;
    }

    public void setLineValues(List<FormLineValue> lineValues) {
        this.lineValues = lineValues;
    }
}