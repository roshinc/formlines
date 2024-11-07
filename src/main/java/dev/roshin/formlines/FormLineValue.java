package dev.roshin.formlines;

import java.util.List;


/**
 * The FormLineValues class represents a container for storing the formLineValues of
 * a form line
 */
public class FormLineValues {
    private List<FormLinePropertiesValueElement> valueList;

    public List<FormLinePropertiesValueElement> getValueList() {
        return valueList;
    }

    public void setValueList(List<FormLinePropertiesValueElement> valueList) {
        this.valueList = valueList;
    }
}