
public class Client {
	public static void main(String[] args) {
		Dengen dengen;
		dengen = new AcAdapter();
		int denatsu = dengen.kyuuden();
		System.out.println( denatsu + "V �ŋ��d����Ă��܂�" );
	}
}

class Dengen { // Target�N���X
public  int kyuuden(); // request()���\�b�h
}

class JapaneseConsent  {
	public int power() {
		return 100;
	}
	
}

class AcAdapter extends Dengen{
	JapaneseConsent[] tagets;
	public int kyuuden() {
		return (int) (power() * 0.16);
	}
}