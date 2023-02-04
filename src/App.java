public class App {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Character character1 = new Warrior();
		Character character2 = new Sorcerer();
		
		character1.setName("Bob the Cowardly Swordsman");
		character2.setName("Rafael the Pervy Necromancer");
		
		character1.setTarget(character2);
		character2.setTarget(character1);
		
		System.out.println("The name of "+character1.getName()+"'s target is: "+character1.getTarget().getName());
		System.out.println("The name of "+character2.getName()+"'s target is: "+character2.getTarget().getName());
		System.out.println();
		
		
		while (character1.getHealth()>0 && character2.getHealth()>0){
			if (character1.getHealth()>0) {
				character1.selectMove();
			}
			else {
				break;
			}
			if (character2.getHealth()>0) {
				character2.selectMove();
			}
			else {
				break;
			}
		}
		
		if (character1.getHealth() <=0){
			System.out.println(character1.getName()+" died!");
		} else if (character2.getHealth()<=0) {
			System.out.println(character2.getName()+" died!");
			
		}
	}
}
