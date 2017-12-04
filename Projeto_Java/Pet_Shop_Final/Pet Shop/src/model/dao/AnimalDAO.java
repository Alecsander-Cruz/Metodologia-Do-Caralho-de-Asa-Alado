/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.bean.Animal;

/**
 *
 * @author Alecsander
 */
public class AnimalDAO {
    
    public void criar(Animal a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO animal (nomeAnimal,tipo, raca, idade, nomeDono, celular) VALUES (?,?,?,?,?,?) ");
            stmt.setString(1,a.getNomeAnimal());      
            stmt.setString(2,a.getTipo());      
            stmt.setString(3,a.getRaca());
            stmt.setString(4,a.getIdade());
            stmt.setString(5,a.getNomeDono());
            stmt.setString(6,a.getCelular());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar:" + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    
    public List<Animal> ler(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Animal> animais = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM animal");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                 
                Animal animal = new Animal();
                
                animal.setIdAnimal(rs.getInt("idAnimal"));
                animal.setNomeAnimal(rs.getString("nomeAnimal"));
                animal.setTipo(rs.getString("tipo"));
                animal.setRaca(rs.getString("raca"));
                animal.setIdade(rs.getString("idade"));
                animal.setNomeDono(rs.getString("nomeDono"));
                animal.setCelular(rs.getString("celular"));
                animais.add(animal);
                
            }
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao ler:" + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return animais;
    }
    
    public void alterar(Animal a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE animal SET nomeAnimal = ?, tipo = ?, raca = ?, idade = ?, nomeDono = ?, celular = ? WHERE idAnimal = ?");
            stmt.setString(1,a.getNomeAnimal());      
            stmt.setString(2,a.getTipo());      
            stmt.setString(3,a.getRaca());
            stmt.setString(4,a.getIdade());
            stmt.setString(5,a.getNomeDono());
            stmt.setString(6,a.getCelular());
            stmt.setInt(7,a.getIdAnimal());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar:" + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    
    public void excluir(Animal a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM animal WHERE idAnimal = ?");
            stmt.setInt(1,a.getIdAnimal());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir:" + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    
    
    
}
