package com.Practice;



    interface MusicalInstrument {
    void play();
    
   public  static void learnInstrument() 
    {
        System.out.println("Learn to play a musical instrument");
    }
}

    abstract class Sound {
    public abstract void listenSound();
}

 class PercussionInstrument extends Sound implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Playing a percussion instrument");
    }

    @Override
    public void listenSound() {
        System.out.println("Listening to percussion instrument sound");
    }	
}

 class StringedInstrument extends Sound implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Playing a stringed instrument");
    }

    @Override
    public void listenSound() {
        System.out.println("Listening to stringed instrument sound");
    }
}
public class InstrumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	MusicalInstrument.learnInstrument();
		  PercussionInstrument tabla = new PercussionInstrument();
	        tabla.play();
	   
	        tabla.listenSound();

	        StringedInstrument violin = new StringedInstrument();
	        violin.play();
	    
	        violin.listenSound();

	}

}
