import java.util.Random;
public class Sinistro {
    private int id;
    private String data;
    private String endereco;
    public Seguradora seguradora;
    public Cliente cliente;
    public Veiculo veiculo;


    public Sinistro(String data, String endereco, Seguradora seguradora, Cliente cliente, Veiculo veiculo) {
        this.data = data;
        this.endereco = endereco;
        this.seguradora = seguradora;
        this.cliente = cliente;
        this.veiculo = veiculo;
        id = gerarID();
    }

    //O método retorna um número inteiro aleatório de 0 até 99999.
    public int gerarID(){
        Random gerador = new Random();
        return gerador.nextInt(99999);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getData(){
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String toString(){
        return String.format("ID: %d,\nData: %s,\nEndereço: %s,\n", id, data, endereco);
    }

}
