package com.soundsystem.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlankDisc {

	private String title;
	private String artist;
	
	//very important! so the property values will be injected into the constructor
	@Autowired
	public BlankDisc(@Value("${disc.title}") String title, @Value("${disc.artist}") String artist) {
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

}
