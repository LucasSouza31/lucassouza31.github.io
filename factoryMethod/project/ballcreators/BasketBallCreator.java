package project.ballcreators;

import project.court.MultiSportCourt;
import project.product.Ball;
import project.product.BasketBall;

public class BasketBallCreator extends MultiSportCourt {

    @Override
    public Ball createBall() {
        return new BasketBall();
    }
    
}
