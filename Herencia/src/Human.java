
public class Human extends Animal{

    public void setAge(int years){

        age = years;
    }
    public void setName(String auxname)
    {
    	name = new String(auxname);
    }

    public void talk(){

        System.out.println("Blah blah blah...");
    }
    public void jump(int times){

        System.out.println(this.name+" has jumped "+times+" times");
    }

    public static void main(String[] args)
    {
    	Human peter = new Human();
    	peter.setAge(30);
    	peter.setName("Peter");

    	System.out.println(peter.name+" is "+peter.age+" years old");
    	peter.checkStatus();

    }

}

