package CreationalPatterns.AbstractFactory.GUI;

public class OSXFactory implements AbstractGUIFactory{
    @Override
    public Component createButton() {
        return new OSXButton();
    }

    @Override
    public Component createList() {
        return new OSXList();
    }

    @Override
    public Component createTable() {
        return new OSXTable();
    }
}
