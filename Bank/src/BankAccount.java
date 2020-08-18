public class BankAccount{
	private int accountNo;
	public Customer customer;
	private int amount;
	private static int initValue = 10001;

	/**
	*\brief Crea un objeto BankAccount inicializado 
	*\param customer Es el cliente para asociar a la cuenta
	*\return Retorna una instancia del objeto
	*/
	public BankAccount(Customer customer)
	{
		this.setAccountNo();
		this.setCustomer(customer);
		System.out.println("Account created\nAccount Nº: "+this.getAccountNo()+
							"\nName: "+this.customer.getName()+"\nID: "+this.customer.getId());
	}
	/**
	*\brief Deposito en la cuenta
	*\param amount Cantidad para depositar
	*\return COMPLETAR!
	*/
	public void deposit(int amount)
	{
		this.setAmount(this.getAmount() + amount);//Deposito de dinero
		System.out.println("\n$"+amount+" deposited");
	}
	/**
	*\brief Retiro la cuenta
	*\param amount Cantidad para retirar
	*\return COMPLETAR!
	*/
	public void withdraw(int amount)
	{
		if(this.amount > amount)
		{
			this.setAmount(this.getAmount() - amount);//Retiro de dinero
			System.out.println("\n$"+amount+" withdrawn");
		}
		else
		{
			System.out.println("Insufficient funds");
		}	
	}
	/**
	*\brief Muestra datos de la cuenta
	*\param void
	*\return COMPLETAR!
	*/
	public void display()
	{
		System.out.println("\nAccount Nº "+this.getAccountNo()+"\nName: "+this.customer.getName()+
							"\nBalance: $"+this.getAmount());
	}
	public static BankAccount getById(HashMap list, long id)
	{
		int i;
		BankAccount auxiliar;
		BankAccount returnValue = null;

		//Mejorar...
		if(list != null && id > 0)
		{
			for(long auxValue : list.keySet())
			{
				if(auxValue == id)
				{
					returnValue = list.get(auxValue);
				}
			}
		}	
		return returnValue;
	}
	/**
	*\brief Setea el atributo customer 
	*\param customer Es el dato para setear en el objeto
	*\return void
	*/
	public void setCustomer(Customer customer)
	{
		if(customer != null)
		{
			this.customer = customer;
		}
	}
	/**
	*\brief Setea el atributo AccountNo autogenerado
	*\param void
	*\return void
	*/
	public void setAccountNo()
	{
		this.accountNo = generateNo();
	}
	/**
	*\brief Setea el atributo amount
	*\param amount Es el dato para setear en el objeto
	*\return void
	*/
	public void setAmount(int amount)
	{
		if(amount >= 100)
		{
			this.amount = amount;
		}
	}
	/**
	*\brief Obtiene el atributo customer
	*\param void
	*\return Retorna un objeto de tipo Customer
	*/
	public Customer getCustomer()
	{
		return this.customer;
	}
	/**
	*\brief Obtiene el atributo AccountNo
	*\param void
	*\return Retorna el numero de cuenta
	*/
	public int getAccountNo()
	{
		return this.accountNo;
	}
	/**
	*\brief Obtiene el atributo amount
	*\param void
	*\return Retorna el monto en la cuenta
	*/
	public int getAmount()
	{
		return this.amount;
	}
	/**
	*\brief Genera automaticamente el numero de cuenta
	*\param void
	*\return Retorna el numero de cuenta para asignar
	*/
	private int generateNo()
	{
		int returnValue = initValue;
		initValue++;
		return returnValue; 
	}
}