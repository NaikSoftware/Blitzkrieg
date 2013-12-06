package ua.naiksoftware.blitzkrieg;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import defpackage.*;

public class GameMIDlet extends MIDlet {

    // $FF: renamed from: a GameMIDlet
    public static GameMIDlet gameMidlet;
    // $FF: renamed from: a javax.microedition.lcdui.Display
    public static Display display;
    // $FF: renamed from: a f
    private GameCanvas gameCanvas;
    // $FF: renamed from: a boolean
    public boolean pause;
    // $FF: renamed from: b boolean
    public boolean start;

    public GameMIDlet() {
        initApp();
    }
    
    // $FF: renamed from: <init> () void
    public void initApp() {
        gameMidlet = this;
        this.pause = false;
        this.start = true;
        display = Display.getDisplay(this);
        this.gameCanvas = new GameCanvas(false);
    }

    public void startApp() {
        System.out.println("startApp begin");
        if (this.start) {
            this.gameCanvas.initCanvas();
            this.start = false;
        }

        if (this.pause) {
            this.gameCanvas.resumeCanvas();
            this.pause = false;
        }

    }

    public void pauseApp() {
        this.pause = true;
        this.gameCanvas.pauseCanvas();
    }

    public void destroyApp(boolean b) {
        notifyDestroyed();
    }

    public static GameMIDlet getInstance() {
        return gameMidlet;
    }

    public static void setDisplayable(Displayable d) {
        display.setCurrent(d);
    }
}
