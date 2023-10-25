/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postogasolina;

/**
 *
 * @author Familia
 */
public class Combustivel {
    public String gasolina;
    public int limiteEstoque;
    public int estoque;
    
    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }
    public int getLimiteEstoque() {
        return limiteEstoque;
    }

    public void setLimiteEstoque(int limiteEstoque) {
        this.limiteEstoque = limiteEstoque;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    
    public void reporEstoque(int adicionado){
        this.estoque =+ adicionado;
    }
    
    void abastecerVeiculo(){
    }
    
    void mostrarEstoque(){
        
    }
}
