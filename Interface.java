package Main;

interface  Animals{
	abstract void sound();
		
}
class horse implements Animals{
	@Override
	public void sound() {
		System.out.println("woof woof");
	}
	
}
class tiger implements Animals{
	@Override
	public void sound() {
		System.out.println("hrrrrrrr hrrrrr");
	}
}

public class Interface {
	public static void main(String[] args) {
		horse h=new horse();
		h.sound();
		tiger t=new tiger();
		t.sound();
		
		
	}

}
