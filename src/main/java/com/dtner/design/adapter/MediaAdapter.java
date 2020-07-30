package com.dtner.design.adapter;

import com.dtner.design.adapter.impl.Mp4PlayerImpl;
import com.dtner.design.adapter.impl.VlcPlayerImpl;
import com.dtner.design.adapter.iter.AdvanceMediaPlayer;
import com.dtner.design.adapter.iter.MediaPlayer;

/**
 * @ClassName MediaAdapter
 * @Description: Media 接口的适配器类
 * @Author dt
 * @Date 2020-07-30
 **/
public class MediaAdapter implements MediaPlayer {

    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer = new VlcPlayerImpl();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer = new Mp4PlayerImpl();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}
