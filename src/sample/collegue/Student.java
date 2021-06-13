package sample.collegue;

public class Student extends Colleague {

    public Student(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage() {
        this.mediator.setView(false, false);
    }
}
