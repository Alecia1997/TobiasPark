package org.tensorflow.demo;

import android.app.Application;

public class GlobalClass  extends Application {

    private boolean MashDetected = false;
    private boolean reloadAgain = true;

    private boolean MScreen = false;
    private boolean BScreen = false;
    private boolean bothDetected = false;


    public boolean isBothDetected() {
        return bothDetected;
    }

    public void setBothDetected(boolean bothDetected) {
        this.bothDetected = bothDetected;
    }

    private boolean AMScreen = false;
    private boolean ABScreen = false;

    public boolean isAMScreen() {
        return AMScreen;
    }

    public void setAMScreen(boolean AMScreen) {
        this.AMScreen = AMScreen;
    }

    public boolean isABScreen() {
        return ABScreen;
    }

    public void setABScreen(boolean ABScreen) {
        this.ABScreen = ABScreen;
    }

    public boolean isBScreen() {
        return BScreen;
    }

    public void setBScreen(boolean BScreen) {
        this.BScreen = BScreen;
    }

    public boolean isMScreen() {
        return MScreen;
    }

    public void setMScreen(boolean MScreen) {
        this.MScreen = MScreen;
    }

    public boolean isMashDetected() {
        return MashDetected;
    }

    public void setMashDetected(boolean mashDetected) {
        MashDetected = mashDetected;
    }

    //SETTER AND GETTER FOR STOP RELOADING FUNCTIONALITY
    public boolean isReload() {
        return reloadAgain;
    }

    public void setReload(boolean reload) {
        reloadAgain = reload;
    }


}

