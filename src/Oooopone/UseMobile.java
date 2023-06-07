package Oooopone;

public class UseMobile {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.setGallery("NO PASSWORD");
		m.setPaytm("PASSWORD REQUIRED");
		m.setBrowser("NO PASSWORD");
		m.setWhatsapp("PASSWORD REQUIRED");
		m.setWhatsapp("NO PASSWORD");
		
		System.out.println("GALLERY= "+m.getGallery()+" PAYTM "+m.getPaytm()+" BROWSER "+m.getBrowser()+" WHATSAPP "+m.getWhatsapp()+" CONTACTS "+m.getContacts());
	}

}
