package module7.middle4;


public class Frog {
    private int jumpCount;


    public void jump(int steps){
        jumpCount += steps;
    }

    public boolean hasWon(){
        return jumpCount >= 30;
    }

}
