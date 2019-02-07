package sample;

import java.util.List;

public class AttributeContainer {
    /**just a simple class to hold any forms/user/whatever that needs to be preserved
     *
     */
    private Form form;
    private List<Form> formList;
    private User user;

    public AttributeContainer(Form form, List<Form> formList, User user) {
        this.form = form;
        this.formList = formList;
        this.user = user;
    }
    public AttributeContainer() {
        this.form = new Form();
        this.formList = null;
        this.user = new User();
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public List<Form> getFormList() {
        return formList;
    }

    public void setFormList(List<Form> formList) {
        this.formList = formList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
