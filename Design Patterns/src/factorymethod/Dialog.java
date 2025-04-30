package factorymethod;

public abstract class Dialog {
    public void show() {
        Button okButton = createButton();
        okButton.render();
    }

    protected abstract Button createButton(); // Factory Method
}
