package dev.roshin.formlines;


/**
 * The FormLineNotifier class represents a notifier within a formline.
 *
 */
public class FormLineNotifier {
    private String type = "static";
    private String template;
    private FormLineNotifiersAttributes attributes;
    private String text;

    public String getType() {
        return type;
    }

    /**
     * Sets the type of the notifier.
     *
     * @param type the type to set for this notifier; defaults to "static" if not specified
     */
    public void setType(String type) {
        this.type = type;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public FormLineNotifiersAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(FormLineNotifiersAttributes attributes) {
        this.attributes = attributes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * The FormLineNotifiersAttributes class represents the attributes for formline notifiers.
     * It contains attributes such as alt text, title, and color.
     */
    public static class FormLineNotifiersAttributes {
        private String alt;
        private String title;
        private String color;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
