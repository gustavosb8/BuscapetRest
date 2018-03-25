package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.ConnectionFactory;
import model.Petshop;

public class DAOPetshop {
	
private Connection con;
	
public ArrayList<Petshop> buscaTodosPetshops(){
        
        con = new ConnectionFactory().getConnection();
        ArrayList<Petshop> petshops = new ArrayList<Petshop>();
        String sql = "SELECT * from petshop";
        
        try{
           PreparedStatement ps = ((Connection) con).prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
        	   Petshop petshop = new Petshop();
        	   petshop.setIdPetshop(Integer.parseInt(rs.getString("idPetshop")));
        	   petshop.setNome(rs.getString("nome"));
        	   petshop.setLongitude(Double.parseDouble(rs.getString("longitude")));
        	   petshop.setLatitude(Double.parseDouble(rs.getString("latitude")));
        	   petshop.setEndereco(rs.getString("endereco"));
        	   petshop.setBairro(rs.getString("bairro"));
        	   petshop.setEstado(rs.getString("estado"));
        	   petshop.setCnpj(rs.getString("cnpj"));
        	   petshop.setCaminho(rs.getString("caminho"));
               
               petshops.add(petshop);
           }
           rs.close();
           ps.close();
        }
        catch(SQLException ex){
            System.out.println("Erro:"+ex.getMessage());
        }
        finally{
            try {
                con.close();;
            } catch (SQLException ex) {
            	System.out.println("Erro:"+ex.getMessage());
            }
        }
        return petshops;
	}
}
