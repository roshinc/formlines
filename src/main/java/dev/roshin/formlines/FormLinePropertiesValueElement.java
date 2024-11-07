package dev.roshin.formlines;


/**
 * The FormLinePropertiesValueElement class represents a form line value element
 * that encapsulates properties of a form line.
 */
public class FormLinePropertiesValueElement implements FormLineValueElement {
    private FormLineProperties properties;

    public FormLineProperties getProperties() {
        return properties;
    }

    public void setProperties(FormLineProperties properties) {
        this.properties = properties;
    }
}