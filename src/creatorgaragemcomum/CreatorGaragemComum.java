/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatorgaragemcomum;

import interfaces.ICreator;
import interfaces.IGaragem;

/**
 *
 * @author Emerson
 */
public class CreatorGaragemComum implements ICreator{

    @Override
    public IGaragem criarGaragem() {
        return new GaragemComum();
    }
    
    @Override
    public String toString() {
        return "Garagem Comum";
    } 
}
