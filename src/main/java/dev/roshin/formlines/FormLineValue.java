package dev.roshin.formlines;

import java.util.List;


/**
 * The FormLineValue class represents a container for storing the formLineValues of
 * a form line
 */
public class FormLineValue {
    private List<FormLineValueElement> valueList;

    public List<FormLineValueElement> getValueList() {
        return valueList;
    }

    public void setValueList(List<FormLineValueElement> valueList) {
        this.valueList = valueList;
    }
}