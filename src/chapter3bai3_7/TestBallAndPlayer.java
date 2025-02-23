package chapter3bai3_7;

public class TestBallAndPlayer {
    public static void main(String[] args) {
        Ball ball = new Ball(1.0f, 2.0f, 3.0f);
        System.out.println(ball); // Expected: Ball[(1.0,2.0,3.0)]

        ball.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println(ball); // Expected: Ball[(4.0,5.0,6.0)]

        Player player = new Player(10, 1.0f, 1.0f);
        System.out.println(player); // Expected: Player[number=10, position=(1.0,1.0,0.0)]

        player.move(2.0f, 3.0f);
        System.out.println(player); // Expected: Player[number=10, position=(3.0,4.0,0.0)]

        player.jump(1.5f);
        System.out.println(player); // Expected: Player[number=10, position=(3.0,4.0,1.5)]

        System.out.println(player.near(ball)); // Expected: false

        player.kick(ball);
        System.out.println(ball); // Expected: Ball[(3.0,4.0,1.5)]
    }
}
