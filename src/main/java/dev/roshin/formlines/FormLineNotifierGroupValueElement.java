package dev.roshin.formlines;

import java.util.List;

/**
 * The FormLineNotifierGroupValueElement class represents a group of notifiers
 * in a form line.
 *
 * This class is used to encapsulate a list of notifiers along with a template
 * that dictates the structure or style of the notifier group.
 *
 */
public class FormLineNotifierGroupValueElement implements FormLineValueElement {
    private String template;
    private List<FormLineNotifier> notifiers;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public List<FormLineNotifier> getNotifiers() {
        return notifiers;
    }

    public void setNotifiers(List<FormLineNotifier> notifiers) {
        this.notifiers = notifiers;
    }
}