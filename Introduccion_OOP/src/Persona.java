public class Persona {
    String nombre;
    int edad;

    public void setNombre(String nombre){
       this.nombre = nombre;
    }
   
    public void setEdad(int edad){
       this.edad = edad;
    }
   
    public void print(){
       System.out.println("Su nombre es " + this.nombre + " su edad " + this.edad);
    }
   
    public boolean esMayorDeEdad(){
       if(this.edad > 18){
            return true;
       }
       else{
    	   return false;
       }
    }
   
    public boolean compararEdad(Persona persona){
       if(this.edad > persona.edad){
    	   return true;
       }
       else{
    	   return false;
       }
    }
   
    public static Persona getMayor(Persona thisA,Persona thisB){
       if(thisA.compararEdad(thisB)){
    	   return thisA;
	   }
       else{
    	   return thisB;
       }
       
    }
   
    public static void main(String args[]) {
        Persona personitaUno = new Persona();
        Persona personitaDos = new Persona();
        Persona personaMayor = new Persona();
        
        personitaUno.nombre = "Carlitos";
        personitaDos.nombre = "Pepito";
        
        personitaUno.edad = 31;
        personitaDos.edad = 24;
        
        personaMayor = Persona.getMayor(personitaUno,personitaDos);
        
        
        personitaUno.print();
        personitaDos.print();
        personaMayor.print();
        
    }
}