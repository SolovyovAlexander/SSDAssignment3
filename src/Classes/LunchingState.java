package Classes;

import Interfaces.State;

public class LunchingState implements State {

    private Context context = null;

    public void setContext(Context context) {
        this.context = context;
    }

    public String getCurrentActivity() {
        return "I'm on a lunch! Leave me alone!";
    }

}
