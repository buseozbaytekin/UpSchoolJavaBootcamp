package HomeworksChapter11;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AccountClient client1 = new AccountClient();
		AccountClient client2 = new AccountClient();
		
		client1.fullName = "Buse Ozbaytekin";
		client2.fullName = "Mustafa Bilce";

		
		client2.setBalance(1000);
		client1.setBalance(10000);
		
		client1.depositAccount(50);
		System.out.println(client1.fullName + " new balance: " + client1.getBalance());
		
		System.out.println();
		
		client2.depositAccount(80);
		System.out.println(client2.fullName + " new balance: " + client2.getBalance());
		
		System.out.println();
		
		client1.withDraw(56);
		System.out.println(client1.fullName + " new balance: " + client1.getBalance());
		
		
		System.out.println();
		double payment = client1.Transfer(2000, client2);
		System.out.println("Money transferred to " +client2.fullName + " from " +client1.fullName + ".\nAfter transfer, " + client1.fullName +" has: "
				+ client1.getBalance() + " and paid " + payment + " for the transfer." +"\n" + client2.fullName + " has: " + client2.getBalance()  + " after the transfer. ");

	
		
	}

}
