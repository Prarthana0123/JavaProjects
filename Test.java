package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

	
	public static void main(String args[])
	{
		
		Playable p=new Veena();	
		Playable p1=new Saxophone();	
		p1.play();
		p.play();
	}
}

