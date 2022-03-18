package capsule;
import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class Capsule01 {
	public static void main(String[] args) {
		HumanNoCapsule human1 = new HumanNoCapsule("田中", 28);
		human1.name = "今田";
		human1.age = 70;
		System.out.println(human1.name + human1.age);
		
		HumanCapsule human2 = new HumanCapsule("小林", 32);
		System.out.println(human2.getName() + human2.getAge());
		human2.setName("佐々木");
		System.out.println(human2.getName() + human2.getAge());
	}
}
