public class Lab03a {
	public static void main (String[] args){
		int doubleloop = 0, floatloop = 0;
		double distance = 10;
		while (distance > 0){
			distance=distance/2;
			doubleloop++;
		}
		float dist = 10;
		while (dist > 0){
			dist=dist/2;
			floatloop++;
		}
		System.out.println("Unlike what Zeno said, in java it takes " + doubleloop + " loops to attain 0 when using double as the primitive type.");
		System.out.println("Unlike what Zeno said, in java it takes " + floatloop + " loops to attain 0 when using float as the primitive type.");
	}

}
