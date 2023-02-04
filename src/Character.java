import java.util.Random;

public abstract class Character implements IMoveset {
	
	
	private String name;
	private Character target;
	private final int maxHealth = 100;
	private int health = 100;
	private final int maxHeals = 1;
	private int countHeals;
	
	@Override
	public String toString() {
		return "Character{" +
				"name='" + name + '\'' +
				", target=" + target.getName() +
				'}';
	}
	
	public Character() {
	
	}
	
	@Override
	public void fastAttack() {
		System.out.println("Generic Fast Attack!");
	}
	
	@Override
	public void strongAttack() {
		System.out.println("Generic Strong Attack!");
		target.health -= 10;
	}
	
	@Override
	public void heal() {
		System.out.println("Generic Heal!");
		this.health = maxHealth;
	}
	
	@Override
	public void selectMove() throws InterruptedException {
		Random rand = new Random();
		int high = 4;
		int low = 1;
		int result = rand.nextInt(high - low) + low;
		switch (result) {
			case 1 -> this.fastAttack();
			case 2 -> this.strongAttack();
			case 3 -> {
				if (this.getHealth() <= 70) {
					this.heal();
				} else if (this.getHealth() == this.maxHealth) {
					Random rand2 = new Random();
					int high2 = 3;
					int low2 = 1;
					int result2 = rand2.nextInt(high2 - low2) + low2;
					switch (result2) {
						case 1 -> this.fastAttack();
						case 2 -> this.strongAttack();
					}
				}
			}
		}
		Thread.sleep(1000);
	}
	
	public void setTarget(Character target) {
		this.target = target;
	}
	
	public Character getTarget() {
		return target;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getMaxHealth() {
		return this.maxHealth;
	}
	
	public int getMaxHeals() {
		return maxHeals;
	}
	
	public void setCountHeals(int countHeals) {
		this.countHeals += countHeals;
	}
	
	public int getCountHeals() {
		return countHeals;
	}
	
	
	public void takeDamage(int damage) {
		this.health -= damage;
		System.out.println(this.getName() + " took " + damage + " damage!  Health: " + this.health + "/" + this.maxHealth);
	}
	
}
