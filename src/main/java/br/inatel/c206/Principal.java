package br.inatel.c206;

public class Principal {
    public static void main(String[] args) {
        Pessoa usuario = new Pessoa("Capiroto", 6666, 3);
        Endereco e1 = new Endereco("Rua 11", "Centro", 666);
        Endereco e2 = new Endereco("Rua 12", "Centro", 2);
        Endereco e3 = new Endereco("Rua 13", "Centro", 3);
        usuario.addEndereco(e1);
        usuario.addEndereco(e2);
        usuario.mostraInfo();
    }
}
