package HomeworksChapter11;

public class AccountClient extends Account{
	
	int id;
	String fullName;
	Account account;


	public AccountClient(int id, String fullName, Account account) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.account = account;
	};


	public AccountClient() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	
	
}
