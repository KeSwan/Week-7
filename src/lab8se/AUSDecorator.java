/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8se;

/**
 *
 * @author 1301147
 */
public class AUSDecorator extends Decorator {

    @Override
    public String getCurrencyDescription() {
           return "Austrailian Dollars";
    }

    @Override
    public double cost(double value) {
        return value;
    }
    
}
