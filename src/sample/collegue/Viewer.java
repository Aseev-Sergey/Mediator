package sample.collegue;

public class Viewer extends Colleague {

    public Viewer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage() {
        this.mediator.setView(false, true);
    }
}
