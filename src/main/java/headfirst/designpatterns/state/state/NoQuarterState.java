package headfirst.designpatterns.state.state;

import headfirst.designpatterns.state.before.GumballMachine;

public class NoQuarter implements State {

    GumballMachine gumballMachine;

    public NoQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
