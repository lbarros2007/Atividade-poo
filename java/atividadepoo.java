package java;

public class atividadepoo {
    private String name;
    private int idade;
    private char sexo;
    private double altura;
    private double peso;
    private String corOlho;
    private String corCabelo;

    public atividadepoo(String name, int idade, char sexo, double altura, double peso, String corOlho, String corCabelo,
            String corPele) {
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.corOlho = corOlho;
        this.corCabelo = corCabelo;
        this.corPele = corPele;
    }

    public atividadepoo() {
        
    }

    public atividadepoo(String name) {
        this.name = name;
        
    }

    private String corPele;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getCorOlho() {
        return corOlho;
    }
    public void setCorOlho(String corOlho) {
        this.corOlho = corOlho;
    }
    public String getCorCabelo() {
        return corCabelo;
    }
    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }
    public String getCorPele() {
        return corPele;
    }
    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
       
}
