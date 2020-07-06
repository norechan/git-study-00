class Teppan {
	
	private String guzai = "もんじゃ";
	
	String cook() {
		return guzai+"を焼きました";
	}
	void nameChange(String guzai) {
		this.guzai = guzai;
	}
}

public class study {
	public static void main(String[] args) {
		Teppan t1 = new Teppan();
		Teppan t2 = new Teppan();
		
		t1.nameChange("やきそば");
		
		System.out.println(t1.cook());
		System.out.println(t2.cook());
	}
}
