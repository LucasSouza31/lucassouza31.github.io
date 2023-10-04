package project.ballcreators;
import project.court.MultiSportCourt;
import project.product.Ball;
import project.product.SoccerBall;

public class SoccerBallCreator extends MultiSportCourt{

    @Override
    public Ball createBall() {
        return new SoccerBall();
    }
    
    public void bolaGerada(){
        System.out.println("Bola em quadra!");
    }
}
