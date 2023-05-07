public class TesteSaqueValorNagtivo {
    public static void main(String[] args) {
        Account conta = new Account();

        conta.deposit(100);
        System.out.println(conta.getSaldo());
        conta.withdraw(200);
        System.out.println(conta.withdraw(200));
        System.out.println(conta.getSaldo());
    }
}
