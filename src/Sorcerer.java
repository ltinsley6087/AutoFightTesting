public class Sorcerer extends Character implements IMoveset{
	
	@Override
	public void fastAttack() {
		System.out.println(this.getName()+" used Shoot Fireball!");
		this.getTarget().takeDamage(10);
		System.out.println();
	}
	
	@Override
	public void strongAttack() {
		System.out.println(this.getName()+" used Lightning Storm!");
		this.getTarget().takeDamage(20);
		System.out.println();
	}
	
	@Override
	public void heal() {
		
		if (this.getCountHeals()<this.getMaxHeals()) {
			this.setHealth(this.getMaxHealth());
			this.setCountHeals(1);
			System.out.println(this.getName()+" used a Healing Spell! Health: "+this.getHealth()+"/"+this.getMaxHealth());
			System.out.println();
		}
		else if (this.getCountHeals()>=this.getMaxHeals()) {
			System.out.println(this.getName()+" has no more Heals left! Health: "+this.getHealth()+"/"+this.getMaxHealth());
			System.out.println();
		}
		
	}
	
}