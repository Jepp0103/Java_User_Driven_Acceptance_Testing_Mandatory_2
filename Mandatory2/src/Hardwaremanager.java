
public class Hardwaremanager {
	
	public void orderHardware(){
		
	}
	public void queryHardware(){
		
	}
	public void sendHardware(int hardwareindex, String destination){
		try {
			Hardware hardware = DataContainer.hardwarestorage.get(hardwareindex);
			hardware.setDestination(destination);
			DataContainer.shippedhardware.add(hardware);
			DataContainer.hardwarestorage.remove(hardwareindex);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Item not found");
		}
	}
}
