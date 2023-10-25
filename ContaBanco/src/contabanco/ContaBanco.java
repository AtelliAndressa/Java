/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

public class ContaBanco {

    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta();
        c1.setNumConta(01);
        c1.setDono("José de Abreu");
        c1.setTipo("cc");
        c1.setSaldo(300);
        c1.estadoAtual();    
        
        Conta c2 = new Conta();
        c2.setNumConta(02);
        c2.setDono("Creuza de Abreu");
        c2.abrirConta("cp");
        c2.depositar(500);
        c2.sacar(250);
        c2.getSaldo();
        c2.estadoAtual();    
        c2.fecharConta();
    }
    
}
