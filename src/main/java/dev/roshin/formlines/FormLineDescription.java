package dev.roshin.formlines;


/**
 * The FormLineDescription class represents the description of a single formline
 * within a formlines.
 */
public class FormLineDescription {
    private String lineNumber;
    private String lineLabel;

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getLineLabel() {
        return lineLabel;
    }

    public void setLineLabel(String lineLabel) {
        this.lineLabel = lineLabel;
    }
}