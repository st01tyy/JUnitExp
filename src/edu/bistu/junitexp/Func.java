package edu.bistu.junitexp;

public class Func
{
    public int Func (int x, int y, int z)
    {
        if((x<2) && (z>5))
            x++;
        else
            x--;
        if((y==3) || (z<8))
            y++;
        else
            y--;
        return x+y+z;
    }
}
