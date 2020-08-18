public class Customer{
	
	private String name;
	private String address;
	private long telephone;
	private long id;
	private String status;


	/**
	*\brief Constructor con parametros
	*\param 
	*\return Retorna una instancia de la clase
	*/
	public Customer(String name,long ID,String address,long telephone)
	{
		this.setName(name);
		this.setId(ID);
		this.setAddress(address);
		this.setTelephone(telephone);
		this.setStatus(Status.ACTIVE);
	}

	/**
	*\brief Constructor con entrada del usuario
	*\param 
	*\return Retorna una instancia de la clase
	*/
	public Customer()
	{
		name = View.inputString("Enter your name-> ");
		id = View.inputLong("Enter your ID-> ");
		address = View.inputString("Enter your address-> ");
		telephone = View.inputLong("Enter your telephone number-> "); 
		try{
			Customer customer = new Customer(name,id,address,telephone);
		}
		catch(NullPointerException e)
		{
			System.out.println("Error");
		}
	}

	/**
	*\brief Modifica datos del objeto
	*\param customer Objeto a editar
	*\return void
	*/
	public void edit(Customer customer)
	{
		try{
			name = View.inputString("Enter your name-> ");
			id = View.inputLong("Enter your ID-> ");
			address = View.inputString("Enter your address-> ");
			telephone = View.inputLong("Enter your telephone number-> "); 
			this.setName(name);
			this.setId(id);
			this.setAddress(address);
			this.setTelephone(telephone);
		}
		catch(NullPointerException exception)
		{
			System.out.println("Error");
		}
	}

	/**
	*\brief Muestra datos del objeto
	*\param void
	*\return void
	*/
	public void display()
	{
		this.getName();
		this.getId();
		this.getAddress();
		this.getTelephone();
	}

	/**
	*\brief Setea el atributo name 
	*\param name Dato a setear
	*\return void
	*/
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	*\brief Setea el atributo id 
	*\param ID Dato a setear
	*\return void
	*/
	public void setId(long ID)
	{
		this.id = ID;
	}
	/**
	*\brief Setea el atributo address
	*\param address Dato a setear
	*\return void
	*/
	public void setAddress(String address)
	{
		this.address = address;
	}
	/**
	*\brief Setea el atributo telephone
	*\param telephone Dato a setear
	*\return void
	*/
	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}
	/**
	*\brief Setea el atributo status
	*\param status Dato a setear
	*\return void
	*/
	public void setStatus(String status)
	{
		this.status = status;
	}
	/**
	*\brief Obtiene el atributo name 
	*\param void
	*\return Retorna el atributo como String
	*/
	public String getName()
	{
		return this.name;
	}
	/**
	*\brief Obtiene el atributo Id 
	*\param void
	*\return Retorna el atributo como long
	*/
	public long getId()
	{
		return this.id;
	}
	/**
	*\brief Obtiene el atributo address
	*\param void
	*\return Retorna el atributo como String
	*/
	public String getAddress()
	{
		return this.address;
	}
	/**
	*\brief Obtiene el atributo telephone
	*\param void
	*\return Retorna el atributo como long
	*/
	public long getTelephone()
	{
		return this.telephone;
	}
	/**
	*\brief Obtiene el atributo status
	*\param void
	*\return void
	*/
	public String getStatus()
	{
		return this.status;
	}
}

public enum Status
{
	String ACTIVE,
	String INACTIVE,
}