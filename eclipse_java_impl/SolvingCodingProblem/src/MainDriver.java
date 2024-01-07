

public class MainDriver {
	public static void main(String[] args) {
		Solutions s = new Solutions();
		assert (s.equalFrequency("cccaa"));
		assert (s.haveConflict(new String[] {"01:15","02:00"}, new String[] {"02:00","03:00"}));
	}
}

