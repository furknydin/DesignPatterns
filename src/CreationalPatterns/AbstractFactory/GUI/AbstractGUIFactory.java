package CreationalPatterns.AbstractFactory.GUI;

public interface AbstractGUIFactory {
    Component createButton();

    Component createList();

    Component createTable();
}
