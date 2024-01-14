package com.hspedu.enum_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSICMUSIC.playing();
    }
}

interface IPlaying{
    public void playing();
}
enum Music implements IPlaying{
    CLASSICMUSIC;

    @Override
    public void playing() {
        System.out.println("播放好汀的音乐");
    }
}