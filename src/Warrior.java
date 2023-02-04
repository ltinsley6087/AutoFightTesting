public class Warrior extends Character implements IMoveset{
	
	
	@Override
	public void fastAttack() {
		System.out.println(this.getName()+" used Swing Sword!");
		this.getTarget().takeDamage(10);
		System.out.println();
	}
	
	@Override
	public void strongAttack() {
		System.out.println(this.getName()+" used Swing Axe!");
		this.getTarget().takeDamage(20);
		System.out.println();
	}
	
	@Override
	public void heal() {
		if (this.getCountHeals()<this.getMaxHeals()) {
			this.setHealth(this.getMaxHealth());
			this.setCountHeals(1);
			System.out.println(this.getName()+" used a Healing Potion! Health: "+this.getHealth()+"/"+this.getMaxHealth());
			System.out.println();
		}
		else if (this.getCountHeals()>=this.getMaxHeals()) {
			System.out.println(this.getName()+" has no more Heals left! Health: "+this.getHealth()+"/"+this.getMaxHealth());
			System.out.println();
		}
	}
	
	
}
