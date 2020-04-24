package Classes;

import Interfaces.State;

public class Context {
    private State state;

    public Context(State initialState) {
        state = initialState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getCurrentActivity() {
        if (this.state != null)
            return this.state.getCurrentActivity();
        else
            return "Земля налетела на небесную ось...";
    }
}
