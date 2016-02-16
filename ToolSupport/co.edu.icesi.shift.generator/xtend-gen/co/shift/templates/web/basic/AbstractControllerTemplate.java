package co.shift.templates.web.basic;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AbstractControllerTemplate {
  public static CharSequence generate(final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package co.shift.");
    String _lowerCase = packageName.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(".web;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import com.vaadin.ui.Component;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class AbstractController {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* List of UI contributors.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<UIContributor> uiContributors;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* List of process contributors.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private HashMap<String, ProcessContributor> processContributors;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Default constructor. Initializes the contributors\' lists.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public AbstractController() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("uiContributors = new ArrayList<>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("processContributors = new HashMap<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// UI Contributors");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Adds the specified UI contributor.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param contributor to be added");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addContributor(UIContributor contributor) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("uiContributors.add(contributor);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Removes the specified UI contributor.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param contributor to be removed");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void removeContributor(UIContributor contributor) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("uiContributors.remove(contributor);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Gets the registered UI contributors.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return list of UI contributors.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<UIContributor> getUIContributors() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return uiContributors;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Calls the contributeUITo method of the UI contributors.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param component to be extended with additional UI components");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param data required for the contribution (optional)");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @throws Exception if there was a problem extending the component");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void extendUI(Component component, Object data) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (UIContributor contributor : uiContributors) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("contributor.contributeUITo(component, data);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Process Contributors");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Adds the specified process contributor.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param key the key of the process contributor to be added");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param contributor to be added ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addContributor(String key, ProcessContributor contributor) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("processContributors.put(key, contributor);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Removes the specified content contributor.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param contributor to be removed");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void removeContributor(ProcessContributor contributor) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("processContributors.remove(contributor);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Gets the registered process contributors.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return HashMap<String, ProcessContributor> containing a list of all process contributors");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public HashMap<String, ProcessContributor> getProcessContributors() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return processContributors;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Calls the contributeProcess method of the process contributors.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param data required by the extension process");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @throws Exception if there was a problem extending the process");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void extendProcess(String key, Object data) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("processContributors.get(key).contributeProcess(data);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}