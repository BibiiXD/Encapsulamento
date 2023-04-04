public class Cliente {
    public static void main(String[] args){
        Conta conta=new Conta();
        conta.setNumero(392);

        //conta.nome="Gabriella";
        //conta.salario=10000;

        //System.out.println(conta.nome);
        //System.out.println(conta.salario);
        System.out.println(conta.getNumero());

        conta.setSalario(20000);
        System.out.println(conta.getSalario());

        conta.setNome("Gabriella");
        System.out.println(conta.getNome());
    }
}
