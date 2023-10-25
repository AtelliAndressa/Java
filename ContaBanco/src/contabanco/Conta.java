/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabanco;

/**
 *
 * @author Familia
 */
public class Conta {

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //construtor
    public Conta() {
        this.saldo = 0;
        this.status = false;
    }
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual () {
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        
        if ("cc".equals(this.tipo)){
            this.setSaldo(50);
        } else {
            this.setSaldo(150);
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A conta possui saldo e não pode ser fechada"); 
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta possui débitos, regularize");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }
    
    public void depositar(float valor) {
        if (this.isStatus() == true) {
            this.setSaldo(this.getSaldo() + valor);
        } else {
            System.out.println("Não existe uma conta aberta");
        }
    }
    
    public void sacar(float valor) {
        if (this.isStatus() == true && (this.getSaldo() >= valor)) {
            this.setSaldo(this.getSaldo() - valor);
        } else if (this.getSaldo() < valor) {
            System.out.println("Você não possui saldo suficiente para o saque");
        } else {
            System.out.println("Não existe uma conta aberta");
        }
    }
    
    public void pagarMensal() {
        int valor = 0;
        if ("cc".equals(this.getTipo())) {
            valor = 12;
        } else {
            valor = 20;
        }
        
        if (this.status == true && this.getSaldo() > valor) {
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
