public class TrafficLight {
	public static void main(String[] args) {
		int light = 0; // 0 for red, 1 for yellow, 2 for green
		if(light == 0) {
			System.out.println("Stop");
		}
		else if(light == 1) {
			System.out.println("Ready");
		}
		else {
			System.out.println("Go");
		}
	}
}