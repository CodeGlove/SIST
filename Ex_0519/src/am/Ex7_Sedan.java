package am;

//Ex7_Car로부터 상속받은 자식클래스
public class Ex7_Sedan extends Ex7_Car {

	public boolean isSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}

	private boolean sunroof;//true: 유설치, false: 무설치
}
