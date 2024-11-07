package dev.roshin.formlines;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The FormLinesModel class is a generic class designed to hold and manage a collection of formlines
 * that extend the FormLine class.
 *
 * @param <L> The type of form line that extends FormLine.
 */
public class FormLinesModel<L extends FormLine> {
    private List<L> lines;
    private boolean hideLineNumbers = false;
    private boolean hasButtonMenu = false;

    public FormLinesModel(List<L> lines) {
        this.lines = Objects.requireNonNull(lines, "Lines list cannot be null");
    }

    public FormLinesModel() {
        this(new ArrayList<>());
    }

    public void setLines(List<L> lines) {
        this.lines = Objects.requireNonNull(lines, "Lines list cannot be null");
    }

    public List<L> getLines() {
        return lines;
    }

    public boolean isHideLineNumbers() {
        return hideLineNumbers;
    }

    public void setHideLineNumbers(boolean hideLineNumbers) {
        this.hideLineNumbers = hideLineNumbers;
    }

    public boolean isHasButtonMenu() {
        return hasButtonMenu;
    }

    public void setHasButtonMenu(boolean hasButtonMenu) {
        this.hasButtonMenu = hasButtonMenu;
    }

    public boolean isEmpty() {
        return lines == null || lines.isEmpty();
    }
}