package sample.collegue;

public class Teacher extends Colleague {

    public Teacher(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage() {
        this.mediator.setView(true, false);
    }
}
