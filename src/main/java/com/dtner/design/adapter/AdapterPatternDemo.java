package com.dtner.design.adapter;

/**
 * @ClassName AdapterPatternDemo
 * @Description: 适配器模式
 * @Author dt
 * @Date 2020-07-30
 **/
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","mp3播放");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far far away.vlc");
        audioPlayer.play("avi","mind me.avi");
    }

}
