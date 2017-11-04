package foodupload;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandeep
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp1
 */
public class foodinterImpl implements foodinterface{

 
    @Override
    public void insert(foodgettersetter cgs) {
                                             
        
                 try {
            
            Connection conn =load.Load.getInstance().getConnection();
            
            String query = "insert into foodupload(username,car_name,car_price,car_image) values (?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, cgs.getUsername());
            ps.setString(2, cgs.getCarname());
            ps.setString(3, cgs.getCarprice());
            ps.setString(4, cgs.getCarimage());
            
            ps.executeUpdate();
            
        } catch (SQLException e) 
        {
        }
        
    }

    
    
    @Override
    public void delete(int pid)
    {
        try
        {
            
            Connection conn =load.Load.getInstance().getConnection();
            
            String query = "delete from FOODUPLOAD where id = ? ";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, pid);
            
            ps.executeUpdate();
            
        }
        catch(SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    
    @Override
    public List getcar_info() {
        
                    List list= new ArrayList<>();
            try 
            {
            
                Connection conn =load.Load.getInstance().getConnection();
            
                String query = "select * from foodupload";

                    PreparedStatement ps = conn.prepareStatement(query);

                      
                ResultSet rs =  ps.executeQuery();
                
                while(rs.next() )
                {
          foodgettersetter cgs = new foodgettersetter();

                    cgs.setId(rs.getInt(1));
                    cgs.setUsername(rs.getString(2));
                    cgs.setCarname(rs.getString(3));
                    cgs.setCarprice(rs.getString(4));
                    cgs.setCarimage(rs.getString(5));
                   
                    list.add(cgs);



                 }

        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
            
        return list;

        
        
     }
    
    
    //update code ============================================
    @Override
    public void update(foodgettersetter p) {
         try
            {
            
            Connection conn =load.Load.getInstance().getConnection();
            
            String query = "UPDATE  FOODUPLOAD SET CAR_NAME=?, CAR_PRICE=? WHERE id ="+p.getId();
            
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            
            ps.setString(1, p.getCarname());
            ps.setString(2, p.getCarprice());
             ps.executeUpdate();
                   
                   
                  
    }
       catch(SQLException e)        
    {
       e.printStackTrace();
    }
            
            
    }
    
    
    
     @Override
    public foodgettersetter getcargettersetter(int pid) {
        try 
            {
            
                Connection conn =load.Load.getInstance().getConnection();
            
                String query = "select * from FOODUPLOAD where id = ?";

                PreparedStatement ps = conn.prepareStatement(query);
                foodgettersetter p1= new foodgettersetter();

               ps.setInt(1, pid);
  

                ResultSet rs =  ps.executeQuery();
                
                while(rs.next() )
                {
                    foodgettersetter p =new foodgettersetter();

                    p.setId(rs.getInt("ID"));
                    p.setCarname(rs.getString("CAR_NAME"));
                    p.setCarprice(rs.getString("CAR_PRICE"));
                    p.setCarimage(rs.getString("CAR_IMAGE"));

                    return p;


                 }

        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
            
        return null;
    }
    
}