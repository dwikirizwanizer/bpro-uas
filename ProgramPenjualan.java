import java.util.*;
public class ProgramPenjualan {
	//Inisialisasi vector user
	public static Vector <String> username = new Vector <String>();
	public static Vector <String> password = new Vector <String>();
	public static Vector <String> status = new Vector <String>();
	public static Scanner sc = new Scanner (System.in);
	
	public static void main (String [] args){
		//Data awal
		username.add("admin");
		password.add("admin");
		status.add("admin");
			boolean ceklogin = false;
		
		do {
			//Menu Login
			System.out.println ("");
			System.out.println ("======= SILAHKAN ANDA LOGIN =======");
			System.out.print ("Input Username \t: ");
			String user = sc.next();
			System.out.print ("Input Password \t: ");
			String pass = sc.next();
				if (username.contains(user) && password.contains(pass)) {
					if (username.indexOf(user) == password.indexOf(pass)){
						int urutan = username.indexOf(user);
						String cek = status.elementAt(urutan);
						if (cek.equalsIgnoreCase("admin")){
							System.out.println ("Login Sukses "+user+", Anda Login sebagai admin");
							MaintenanceBarang.admin ();
							ceklogin = true;
							}
						}
						else {
							System.out.println ("Oops,..Inputan anda salah, Login gagal"); }
				}
					else {
						System.out.println ("Oops,..Inputan anda salah, Login gagal"); }
		} while (ceklogin = true);
	}
	
}