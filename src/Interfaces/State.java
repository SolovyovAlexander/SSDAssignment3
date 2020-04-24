package Interfaces;

import Classes.Context;

public interface State {
    Context context = null;

    void setContext(Context context);

    String getCurrentActivity();
}