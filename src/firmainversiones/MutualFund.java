/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firmainversiones;

/**
 *
 * @author Estudiante
 */
public class MutualFund extends ShareAsset {
    private double totalShare;

    public MutualFund(double totalShare, String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        this.totalShare = totalShare;
    }

    @Override
    public double getMarketValue() {
      return (this.totalShare*this.currentPrice);   
    }

    @Override
    public double getProfit() {
       return (this.totalShare*this.currentPrice)-this.totalCost;   
    }
  
}
