package project.product;

public class BasketBall implements Ball {

    private String marca;
    private String nivel;
    private int circunferenciaMin;
    private int peso;
  
    @Override
    public void showDetails() {
        System.out.println("Bola de basquete criada!");
    }

    //getters and setters

}
