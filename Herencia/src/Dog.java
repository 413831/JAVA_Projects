


public class Dog extends Animal {/////Subclass inherits Animal variables and methods

	public Dog(int dogsAge) {
    age = dogsAge;
    }
    public void bark(){
    System.out.println("Woof!");
    }
    public void run(int feet){
    System.out.println("Your dog ran "+feet+" feet!");
    }
    public int getAge(){
    return age;
    }
    public void setName(String auxname)
    {
        name = new String(auxname);
    }

	public static void main(String[] args) {///Main

	Dog spike = new Dog(4);/////New instance
    int spikeAge = spike.getAge();

    spike.setName("Spike");
    System.out.println(spike.name+" is "+spikeAge+" years old");
    spike.checkStatus();
    spike.bark();
    spike.run(8);
	}
}