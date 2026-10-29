package desafioAula02;

public class ClasseDoDesafioMain {

    public static void main(String[] args) {

        System.out.println("Programa que calcula o valor total de um produto");

        double precoProduto = 20.00;
        int quantidadeDoProduto = 8;

        int valorTotal = (int) precoProduto * quantidadeDoProduto;
        
        String palavra = "Resultado";
        
        System.out.println (palavra+" = "+valorTotal);
        
     // DESAFIO 2 - Conversão de dólar para real
        
        
        System.out.println("Programa de conversão de dólar para real");
        
        double valorDollarUsd = 400.00;
        double cotacaoEmReal = 6.00;
        
        int valrReal = (int) (valorDollarUsd  * cotacaoEmReal);
        System.out.println("O equivalente a "+valorDollarUsd+"em dólares, aqui no Brasil seria R$ "+valrReal+" em reais.");
        
        // DESAFIO 3 - Calculo de desconto

        System.out.println("\n=== Calculo de desconto ===");
        
        double precoOriginal = 200.00;
        double percentualDesconto = 10;
      
        double valorDeDesconto = precoOriginal * percentualDesconto / 100;
        
        double novoPreco = precoOriginal - valorDeDesconto;
        
        System.out.printf("Preco original: R$ %.2f%n", precoOriginal);
        System.out.printf("Percentual de desconto: %.0f%%%n", percentualDesconto);
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDeDesconto);
        System.out.printf("Novo preco com desconto: R$ %.2f%n", novoPreco);

     
    }
}
