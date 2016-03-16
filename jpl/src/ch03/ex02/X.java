package src.ch03.ex02;

public class X {
	protected int xMask = 0x00ff;
	protected int fullMask;

	public X(){
		fullMask = xMask;
		System.out.printf("[Constructor X]fullMask:%04x xMask:%04x%n", fullMask, xMask);
	}

	public int mask(int orig){
		return (orig & fullMask);
	}
}
