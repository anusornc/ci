public class TV {
	int channel;
	int volumeLevel;
	boolean on;
	
	//-------------------------------------
	
	//Constructor Method  (First Methoad working)
	public TV() {
		this.channel = 0;
		this.volumeLevel = 0;
		this.on = false;
	}
	
	
	public TV(int defaultChannel,int defaultVolumeLevel) {
		
		this.channel = defaultChannel;
		this.volumeLevel = defaultVolumeLevel;
		this.on = false;
		
	}
	
	public void turnOn(){
		
		this.on = true;
		
	}

	public void turnOff() {
		
		this.on = false;
		
	}
	
	public void setChannel(int newChannel) {
		
		this.channel = newChannel;
		
	}
	
	public void setVolume(int newVolumeLevel) {
		
		this.volumeLevel = newVolumeLevel;
		
	}
	
	public void channelUp() {
		
		this.channel++;
		
	}
	
	public void channelDown() {
		
		this.channel--;
		
	}
	
	public void volumeUp() {
		
		this.volumeLevel++;
		
	}
	
	public void volumeDown() {
		
		this.volumeLevel--;
		
	}
	
	public static void main(String args[]) {
		
		TV sony = new TV();
		//TV sony = new TV(3,20);
		//TV sony;
		
		sony.turnOn();
		System.out.println(" status of tv on =" + sony.on);
		
		sony.setChannel(3);
		System.out.println("Tv channel = " + sony.channel);
		
	}
	
}

