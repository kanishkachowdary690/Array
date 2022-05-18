package aray;

public class Tester4 {

	public static void main(String[] args) 
	{
		Weapons w1=new Weapons("shortGun","gun");
		Weapons w2=new Weapons("longRangeBow","Bow");
		Powerup pw1=new Powerup("booster","speedrun");
		Powerup pw2=new Powerup("Immortal","Lifetime");
		Player p1=new Player(101,5,"msd",w1);
		Player p2=new Player(102,4,"abd",w2);
		p1.display();
		p1.powers(pw1);
		p2.powers(pw2);
		
		p2.display();
		
    }
}

