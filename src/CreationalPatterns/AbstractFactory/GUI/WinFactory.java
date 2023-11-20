package CreationalPatterns.AbstractFactory.GUI;

public class WinFactory implements AbstractGUIFactory{

    @Override
    public Component createButton() {
        return new WinButton();
    }

    @Override
    public Component createList() {
        return new WinList();
    }

    @Override
    public Component createTable() {
        return new WinTable();
    }
}
