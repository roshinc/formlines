package dev.roshin.formlines.main;

import com.google.gson.Gson;
import dev.roshin.formlines.*;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create an instance of CustomFormLine
        CustomFormLine formLine = new CustomFormLine();
        formLine.setType("formLineRow");
        formLine.setTemplate("formLine");

        // Set line description
        FormLineDescription description = new FormLineDescription();
        description.setLineNumber("1");
        description.setLineLabel("Line Label");
        formLine.setLineDescription(description);

        // Set line values
       FormLineValue rptValue = new FormLineValue();

        // RPT Value Elements
        FormLinePropertiesValueElement rptPropertiesElement = new FormLinePropertiesValueElement();
        FormLineProperties rptProperties = new FormLineProperties();
        rptProperties.setValueLabel("RPT");
        rptProperties.setValueVal("12a");
        rptProperties.setStyle("plain");
        rptPropertiesElement.setProperties(rptProperties);

        // Notifier Group for RPT Value
        FormLineNotifierGroupValueElement rptNotifierGroup = new FormLineNotifierGroupValueElement();
        rptNotifierGroup.setTemplate("notifierGroup");

        FormLineNotifier notifier = new FormLineNotifier();
        notifier.setType("static");
        notifier.setTemplate("notifier");

        FormLineNotifier.FormLineNotifiersAttributes attributes = new FormLineNotifier.FormLineNotifiersAttributes();
        attributes.setAlt("Converted");
        attributes.setTitle("Converted");
        attributes.setColor("green");
        notifier.setAttributes(attributes);
        notifier.setText("C");

        rptNotifierGroup.setNotifiers(Collections.singletonList(notifier));

        rptValue.setValueList(Arrays.asList(rptPropertiesElement, rptNotifierGroup));

        // CMP Value Elements

        FormLineValue cmpValue = new FormLineValue();

        FormLinePropertiesValueElement cmpPropertiesElement = new FormLinePropertiesValueElement();
        FormLineProperties cmpProperties = new FormLineProperties();
        cmpProperties.setValueLabel("CMP");
        cmpProperties.setValueVal("12000");
        cmpProperties.setStyle("currency");
        cmpPropertiesElement.setProperties(cmpProperties);

        // Notifier Group for CMP Value
        FormLineNotifierGroupValueElement cmpNotifierGroup = new FormLineNotifierGroupValueElement();
        cmpNotifierGroup.setTemplate("notifierGroup");
        cmpNotifierGroup.setNotifiers(Collections.singletonList(notifier)); // Reusing the notifier

        cmpValue.setValueList(Arrays.asList(cmpPropertiesElement, cmpNotifierGroup));

        formLine.setLineValues(Arrays.asList(rptValue, cmpValue));

        // Set additional property
        formLine.setAdditionalProperty("Additional Info");

        FormLinesModel<CustomFormLine> formLinesModel = new FormLinesModel<>(Collections.singletonList(formLine));

        System.out.println(formLinesModel);
        System.out.println(new Gson().toJson(formLinesModel));
    }
}
