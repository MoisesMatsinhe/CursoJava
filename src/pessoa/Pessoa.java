/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pessoa;

/**
 * Faça um programa para representar a árvore genealógica de uma família. Para
tal, crie uma classe Pessoa que permita indicar, além de nome e idade, o pai e a
mãe. Tenha em mente que pai e mãe também são do tipo Pessoa.
 * 
 */
public class Pessoa {
    private String nome;
    private String idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    

}
