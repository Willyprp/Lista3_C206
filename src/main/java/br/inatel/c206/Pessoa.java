package br.inatel.c206;

public class Pessoa {
    public String nome;
    public int cpf;
    Endereco[] enderecos;

    public Pessoa(String nome, int cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        enderecos = new Endereco[qtdEnd];
    }
    public void addEndereco(Endereco end){
        for (int i=0;i<enderecos.length;i++){
            if(enderecos[i] == null){
                enderecos[i] = end;
                break;
            }
        }

    }
    public void mostraInfo(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        for(int i=0;i<enderecos.length;i++){
            if(enderecos[i] != null){
                System.out.println("Rua: " + enderecos[i].rua);
                System.out.println("Bairro: " + enderecos[i].bairro);
                System.out.println("N°: " + enderecos[i].num);
                System.out.println("");
            }

        }

    }
}
