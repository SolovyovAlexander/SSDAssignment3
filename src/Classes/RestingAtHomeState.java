package Classes;

import Interfaces.State;

public class RestingAtHomeState implements State {

    private Context context = null;

    public void setContext(Context context) {
        this.context = context;
    }

    public String getCurrentActivity() {
        return "I'm resting at home! Leave me alone!";
    }

}
