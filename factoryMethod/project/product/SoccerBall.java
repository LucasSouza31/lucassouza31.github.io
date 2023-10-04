package project.product;

public class SoccerBall implements Ball {

    private String marca;
    private String nivel;
    private int circunferenciaMin;
    private int peso;

    @Override
    public void showDetails() {
        System.out.println("Marca: "+ this.marca);
        System.out.println("Nível: "+this.nivel);
        System.out.println("Circunferência: "+this.circunferenciaMin);
        System.out.println("Peso: "+this.peso);
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getCircunferenciaMin() {
        return circunferenciaMin;
    }

    public void setCircunferenciaMin(int circunferenciaMin) {
        this.circunferenciaMin = circunferenciaMin;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
