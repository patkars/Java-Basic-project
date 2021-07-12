package day3;

public class BankAccount {
private int otp;
private int ac_holder_number;
private String photo;
public void setOtp(int x) {
	otp=x;
}
public void setAc_holder_number(int y) {
	ac_holder_number=y;
}
public void setPhoto(String s) {
	photo=s;
}
public int getOpt() {
	return otp;
}
public int getAc_holder_number() {
	return ac_holder_number;
	
} 
public String getPhoto() {
	return photo;
}

}
