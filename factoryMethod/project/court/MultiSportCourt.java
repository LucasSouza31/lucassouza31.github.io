package project.court;

import project.product.Ball;

public abstract class MultiSportCourt  {
    public abstract Ball createBall();

    public void bolaGerada(){
        System.out.println("Bola criada");
    }

}
