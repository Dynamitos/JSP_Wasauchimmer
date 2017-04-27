
package e103;

import java.util.ArrayList;
import java.util.List;

public class CalcFiboBean
{

    private List<Integer> fibo  = new ArrayList<>();
    
    public CalcFiboBean()
    {
        
    }

    public List<Integer> getFibo()
    {
        return fibo;
    }

    public void setFibo(List<Integer> fibo)
    {
        this.fibo = fibo;
    }
    
    
}
