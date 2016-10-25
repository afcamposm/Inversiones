/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firmainversiones;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Company {
    private HashMap<String, Client> clients;
    
    public Company(){
       this.clients = new HashMap<>();
    }
    
    public boolean addClient(Client client){
       if(!this.clients.containsKey(client.getCc())){
         this.clients.put(client.getCc(), client);
         return true;
       }
       return false;
    }
    
    public double calAmountAllMarket(){
     double marketValue = 0;
     for (Client client : this.clients.values()) {
       marketValue+=client.sumMarketvalue();
     }
     return marketValue;
    }
    
    public double calAllProfit(){
     double profitValue = 0;
     for (Client client : this.clients.values()) {
       profitValue+=client.sumProfit();
     }
     return profitValue;
    }
    
    public Client calClientMaxProfit(){
        Client maxProfit=null;
        for (Client client : this.clients.values()){
          if(maxProfit == null)
              maxProfit = client;
          else{
             if(client.sumProfit() > maxProfit.sumProfit()){
               maxProfit = client;
             }
          }
        } 
        return maxProfit;
    }
    //Clientes ordenados descendentement por 
    //Valor en el mercado
    public ArrayList listClient(){
      ArrayList<Client> clients = 
              new ArrayList();
      //Obteniendo los clientes
      for (Client client : this.clients.values())
          clients.add(client);
      
      //Ordenando
      for(int i = 0; i< clients.size()-1;i++){
          Client actual = this.clients.get(i);
          int pos = i;
          for(int j = i+1 ; j<clients.size();j++){
             if(actual.sumMarketvalue() 
                     > clients.get(j).sumMarketvalue()){
                 pos = j;
             }
          }
          //Intercambiar
          Client temp=this.clients.get(pos);
          //
          //
      }
      return null;
    }
    
    public ArrayList calMarketAndProfitByAsset(){
      return null;
    }
    public ArrayList calMarketAndProfitByAge(){
      return null;
    }
    
}
