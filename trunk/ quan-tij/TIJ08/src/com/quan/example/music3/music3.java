package com.quan.example.music3;

import com.quan.example.Note;

class Instrument{
	void play(Note n){
		System.out.println("Instrument.play()"+n);
	}
	String what(){
		return "Instrument";
	}
	void adjust(){
		System.out.println("Adjusting Instrument");
	}
}
class Wind extends Instrument{
	void play(Note n){
		System.out.println("Wind.play() "+n);
	}
	String what(){
		return "Wind";
	}
}
public class music3 {

}
