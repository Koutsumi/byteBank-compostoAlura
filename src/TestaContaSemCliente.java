public class TestaContaSemCliente {

    public static void main(String[] args) {
        Account contaTeste = new Account();
        contaTeste.titular = new Client();
        contaTeste.titular.nome = "Teste da Silva";

        System.out.println(contaTeste.titular.nome);
    }
}
