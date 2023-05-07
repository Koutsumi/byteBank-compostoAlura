public class TestaBanco {

    public static void main(String[] args) {
        Client fernanda = new Client();

        fernanda.nome = "Fernanda M Baccarini";
        fernanda.cpf = "222.222.222-22";
        fernanda.profissao = "QA";

        Account contaFernanda = new Account();
        contaFernanda.deposit(300);

        contaFernanda.titular = fernanda;
        System.out.println(contaFernanda.titular.nome);
    }

}
