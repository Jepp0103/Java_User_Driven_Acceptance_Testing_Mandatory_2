import java.util.ArrayList;
import java.util.List;

public class DataContainer {
	public static List<Hardware> hardwarestorage = new ArrayList<>();
	
	public static List<Hardware> orderedhardware = new ArrayList<>();

	public static List<Hardware> shippedhardware = new ArrayList<>();

	public static void dummyData() {
		hardwarestorage.add(new Hardware("Kompooter"));
		orderedhardware.add(new Hardware("Delefon"));
		shippedhardware.add(new Hardware("MacPC","Havnen"));

	}

}
