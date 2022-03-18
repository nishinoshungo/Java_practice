package practice;

public class Chapter12 {
	public static void main(String[] args) {
		CapsuleMan man1 = new CapsuleMan("小林", 32);
		System.out.println("名前は" + man1.getName() + "です");
		System.out.println("年齢は" + man1.getAge() + "です");
		man1.upAge();
		System.out.println("誕生日を迎えたので年齢が" + man1.getAge() + "になりました");
	}
}
