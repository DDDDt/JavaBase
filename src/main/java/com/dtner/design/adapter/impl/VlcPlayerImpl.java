package com.dtner.design.adapter.impl;

import com.dtner.design.adapter.iter.AdvanceMediaPlayer;

/**
 * @ClassName VlcPlayerImpl
 * @Description: vlc player
 * @Author dt
 * @Date 2020-07-30
 **/
public class VlcPlayerImpl implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file. Name "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
