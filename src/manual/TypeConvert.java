package manual;

public class TypeConvert {
	public static Float toReal (Object e) {
		if (e.getClass().getSimpleName().equals("Character")) {
			int num_val = (int) ((char)e);
			return Float.parseFloat(Integer.toString(num_val));
		}
		else return Float.parseFloat((e.toString()));
	}
	
	public static Integer toInteger (Object e) {
		if (e.getClass().getSimpleName().equals("Character")) {
			int num_val = (int) ((char)e);
			return Integer.parseInt(Integer.toString(num_val));
		}
		else return Integer.parseInt(e.toString());
	}
}
