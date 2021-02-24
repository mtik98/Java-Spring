package com.InConceptLabs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        applicationContext.close();
    }
}
