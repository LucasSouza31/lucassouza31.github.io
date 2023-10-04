package project;

import project.ballcreators.BasketBallCreator;
import project.ballcreators.SoccerBallCreator;
import project.court.MultiSportCourt;
import project.product.Ball;
import project.product.SoccerBall;



public class Principal {
    public static void main(String[] args) {
       
        MultiSportCourt bolaDeFutebol= new SoccerBallCreator();

        SoccerBall bola = (SoccerBall) bolaDeFutebol.createBall();   

        bola.setMarca("Addidas");
        bola.setNivel("Amador");
        bola.setCircunferenciaMin(75);
        bola.setPeso(700);

        bola.showDetails();
        bolaDeFutebol.bolaGerada();

    
    }
}

