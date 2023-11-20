package CreationalPatterns.AbstractFactory.GUI;

public class Client {
    public Client(AbstractGUIFactory factory){
        Component button = factory.createButton();
        button.paint();

        Component list = factory.createList();
        list.paint();

        Component table = factory.createTable();
        table.paint();
    }
}

