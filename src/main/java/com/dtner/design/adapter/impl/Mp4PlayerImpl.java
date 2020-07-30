package com.dtner.design.adapter.impl;

import com.dtner.design.adapter.iter.AdvanceMediaPlayer;

/**
 * @ClassName Mp4PlayerImpl
 * @Description:
 * @Author dt
 * @Date 2020-07-30
 **/
public class Mp4PlayerImpl implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
