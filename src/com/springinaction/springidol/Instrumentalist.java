package com.springinaction.springidol;

import com.springinaction.exception.PerformanceException;


/**
 * Created by yiben on 2015/10/28.
 */
public class Instrumentalist implements Performer {

    private String song;
    private Instrument instrument;

    public Instrumentalist() {

    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }


    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    public String screamSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
