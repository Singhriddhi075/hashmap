package GenericTreeDs;

public class GTclient {
//10 3 20 2 50 0 60 0 30 0 40 1 70 0
	public static void main(String[] args) {
		Generictree GT=new Generictree();
		GT.display();
		System.out.println(GT.size());
		System.out.println(GT.max());
		System.out.println(GT.ht());
//		System.out.println(GT.find(60));

	}

}
