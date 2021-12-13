public class precificacao {
    // atributos
    public float custoUnitario;
    public short quantidade;
    public float custoFixo;
    public float lucroLiquido;

    public float calcularPrecoDeVenda() {
        float totalDaCompra = this.custoUnitario * this.quantidade;
        float faturamento = this.custoFixo + totalDaCompra + this.lucroLiquido;

        return faturamento / this.quantidade;
    }
}
