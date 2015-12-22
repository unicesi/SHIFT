package co.shift.pcs.basic.ext.risks;

import co.shift.pcs.basic.web.PCSUI;
import co.shift.pcs.basic.web.Registry;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;

public class PopUpRiskForm extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private Button button_2;
	@AutoGenerated
	private Button button_1;
	@AutoGenerated
	private TextField textField_4;
	@AutoGenerated
	private TextField textField_3;
	@AutoGenerated
	private TextArea textArea_1;
	@AutoGenerated
	private TextField textField_2;
	public static final String ID = "PRF";

	private int projectID;

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public PopUpRiskForm() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
		button_1.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				RiskFormController.getInstance().addRiskToProject(projectID);
			}
		});

		button_2.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				clearFormFields();
				((PCSUI) Registry.get(PCSUI.UI)).closeSubWindow();
			}
		});
	}

	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public TextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(TextField textField_3) {
		this.textField_3 = textField_3;
	}

	public TextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(TextField textField_2) {
		this.textField_2 = textField_2;
	}

	public TextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(TextField textField_4) {
		this.textField_4 = textField_4;
	}

	public TextArea getTextArea_1() {
		return textArea_1;
	}

	public void setTextArea_1(TextArea textArea_1) {
		this.textArea_1 = textArea_1;
	}

	public void clearFormFields() {
		textField_2.setValue("");
		textField_3.setValue("");
		textField_4.setValue("");
		textArea_1.setValue("");
	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("200px");
		mainLayout.setHeight("240px");
		
		// top-level component properties
		setWidth("200px");
		setHeight("240px");
		
		// textField_2
		textField_2 = new TextField();
		textField_2.setCaption("Name");
		textField_2.setImmediate(false);
		textField_2.setWidth("-1px");
		textField_2.setHeight("-1px");
		textField_2.setRequired(true);
		mainLayout.addComponent(textField_2, "top:20.0px;left:20.0px;");
		
		// textArea_1
		textArea_1 = new TextArea();
		textArea_1.setCaption("Description");
		textArea_1.setImmediate(false);
		textArea_1.setWidth("161px");
		textArea_1.setHeight("59px");
		textArea_1.setRequired(true);
		mainLayout.addComponent(textArea_1, "top:61.0px;left:19.0px;");
		
		// textField_3
		textField_3 = new TextField();
		textField_3.setCaption("Impact %");
		textField_3.setImmediate(false);
		textField_3.setWidth("-1px");
		textField_3.setHeight("-1px");
		textField_3.setRequired(true);
		mainLayout.addComponent(textField_3, "top:137.0px;left:20.0px;");
		
		// textField_4
		textField_4 = new TextField();
		textField_4.setCaption("Probability %");
		textField_4.setImmediate(false);
		textField_4.setWidth("-1px");
		textField_4.setHeight("-1px");
		textField_4.setRequired(true);
		mainLayout.addComponent(textField_4, "top:179.0px;left:19.0px;");
		
		// button_1
		button_1 = new Button();
		button_1.setCaption("Add");
		button_1.setImmediate(true);
		button_1.setWidth("-1px");
		button_1.setHeight("-1px");
		mainLayout.addComponent(button_1, "top:208.0px;left:24.0px;");
		
		// button_2
		button_2 = new Button();
		button_2.setCaption("Cancel");
		button_2.setImmediate(true);
		button_2.setWidth("-1px");
		button_2.setHeight("-1px");
		mainLayout.addComponent(button_2, "top:208.0px;left:84.0px;");
		
		return mainLayout;
	}

}