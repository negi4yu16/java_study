package src.ch03.ex05;

public class MultiplicationTimeBenchmark extends Benchmark {

	private int loop = 0;

	public MultiplicationTimeBenchmark(int loop){
		this.loop = loop;
	}

	@Override
	void benchmark() {
		long multi = 0;
		for(int i = 1 ; i <= loop ; i++){
			multi *= (long)i;
		}
	}

	public static void main(String[] args){

		int number = 1234567890;
		int count = 1000000000;
		long time = new MultiplicationTimeBenchmark(number).repeat(count);

		System.out.println("loopCount:" + count + " sum number" + number);
		System.out.println("time is " + (time/1000000.0) + " milli seconds");
//		System.out.println("time is " + time + " nano seconds");

	}

}
