package aray;

class Player {
	private int playerId;
	private int health;
	private String playerName;
	private Weapons myWeapon;
	

	private Weapons getMyWeapon() {
		return myWeapon;
	}

	private void setMyWeapon(Weapons myWeapon) {
		this.myWeapon = myWeapon;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;}

Player(int playerId,int health,String playerName,Weapons weapon)
{
	this.playerId=playerId;
	this.health=health;
	this.playerName=playerName;
	this.myWeapon=weapon;
}

public void display()
{
	System.out.println(this.playerId);
	System.out.println(this.health);
	System.out.println(this.playerName);
	System.out.println(this.myWeapon.weaponName);
	System.out.println(this.myWeapon.weaponType);
}
public void powers(Powerup myPower)
{
	System.out.println(myPower.powerUpName+" "+myPower.powerUpUse );
}
}

