package src.ex01;

public class Infinity {

	public void checkInfinityCalc(){
		System.out.println("∞+∞=" + (Double.POSITIVE_INFINITY + Double.POSITIVE_INFINITY));
		System.out.println("∞-∞=" + (Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY));
		System.out.println("∞*∞=" + (Double.POSITIVE_INFINITY * Double.POSITIVE_INFINITY));
		System.out.println("∞/∞=" + (Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY));

		System.out.println("∞+(-∞)=" + (Double.POSITIVE_INFINITY + Double.NEGATIVE_INFINITY));
		System.out.println("∞-(-∞)=" + (Double.POSITIVE_INFINITY - Double.NEGATIVE_INFINITY));
		System.out.println("∞*(-∞)=" + (Double.POSITIVE_INFINITY * Double.NEGATIVE_INFINITY));
		System.out.println("∞/(-∞)=" + (Double.POSITIVE_INFINITY / Double.NEGATIVE_INFINITY));

		System.out.println("(-∞)+(-∞)=" + (Double.NEGATIVE_INFINITY + Double.NEGATIVE_INFINITY));
		System.out.println("(-∞)-(-∞)=" + (Double.NEGATIVE_INFINITY - Double.NEGATIVE_INFINITY));
		System.out.println("(-∞)*(-∞)=" + (Double.NEGATIVE_INFINITY * Double.NEGATIVE_INFINITY));
		System.out.println("(-∞)/(-∞)=" + (Double.NEGATIVE_INFINITY / Double.NEGATIVE_INFINITY));

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Infinity p = new Infinity();
		p.checkInfinityCalc();
	}

}
