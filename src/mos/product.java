/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mos;

/**
 *
 * @author ASUS
 */
public class product {
    private int id;
    private String name;
    private float price;
    private String addDate; 
    private byte[] picture;
    private int Stock;
    
    public product(int mid, String mname, float mprice, String mAddDate, byte[] mimg,int mstock)
    {
        this.id = mid;
        this.name = mname;
        this.price = mprice;
        this.addDate = mAddDate;
        this.picture = mimg;
        this.Stock = mstock;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public String getAddDate()
    {
        return  addDate;
    }
    
    public byte[] getImage()
    {
        return picture;
    }
    public int getStock()
    {
        return Stock ;
    }
    
    
}
