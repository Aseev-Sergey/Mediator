package sample.collegue;

public abstract class Colleague {

    protected Mediator mediator;

    private int check;

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    public Colleague(Mediator med){
        mediator = med;
    }

    public abstract void sendMessage();
}
