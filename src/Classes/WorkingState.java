package Classes;

import Interfaces.State;

public class WorkingState implements State {

    private Context context = null;

    public void setContext(Context context) {
        this.context = context;
    }

    public String getCurrentActivity() {
        return "I'm working! Leave me alone!";
    }

}
