public class App {
    public static void main(String[] args) {
        precificacao precos = new precificacao();

        preco.custoFixo = 50;
        preco.custoUnitario = 10;
        preco.quantidade = 35;
        preco.lucroLiquido = 40;

        float precoDeVenda = preco.calcularPrecoDeVenda();

        System.out.println(String.format("o preço de venda é de R$ %.2f", precoDeVenda));
        }
}