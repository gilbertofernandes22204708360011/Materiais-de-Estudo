/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Teatro
{
	
    private static final int QTDE_MAX = 100;
    private static final double VALOR = 20.0;
    
    private double totalArrecadado;
    
    private int qtdeVendidaNormal;
    private int qtdeVendidaMeia;
    
    public Teatro()
    {
        totalArrecadado = 0.0;
        qtdeVendidaNormal = 0;
        qtdeVendidaMeia = 0;
    }
    
    public boolean vender(boolean meia) 
    {
        if(qtdeVendidaMeia + qtdeVendidaNormal < QTDE_MAX)
        {
            if(meia == false)
            {
                totalArrecadado = totalArrecadado + VALOR;
                qtdeVendidaNormal = qtdeVendidaNormal + 1;
            }
            else
            {
                totalArrecadado = totalArrecadado + (VALOR/2);
                qtdeVendidaMeia = qtdeVendidaMeia + 1;
            }
            return true;
        }
        else
        {
            return false;
        }
    }
    public int getQtdeDisponivel() 
    {
        return qtdeVendidaNormal+qtdeVendidaMeia;
    }
}
