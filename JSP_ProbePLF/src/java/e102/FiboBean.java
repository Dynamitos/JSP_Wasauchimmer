/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e102;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sabrina
 */
public class FiboBean
{
    private List<Integer> nums = new ArrayList<>();
    
    public FiboBean()
    {
        
    }

    public String getNums()
    {
        String s = "";
        for (Integer num : nums)
        {
            s += num + " ";
        }
        return s;
    }

    public void setNums(List<Integer> nums)
    {
        this.nums = nums;
    }
    
}
