package factorymethod;

public class MacOSDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new MacOSButton();
    }
}
