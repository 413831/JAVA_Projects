package work.matrices.test;

public class TestArreglos
{
    public static void main(String[] args)
    {
        int edades[] = new int[3];
        //System.out.println("edades = " + edades);

        edades[0] = 10;
        //System.out.println("edades[0] = " + edades[0]);

        for (int i = 0; i < edades.length; i++)
        {
            System.out.println("i = " + i);
            System.out.println("edades[i] = " + edades[i]);
        }
    }
}
