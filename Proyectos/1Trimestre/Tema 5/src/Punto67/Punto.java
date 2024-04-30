package Punto67;

import java.time.chrono.ThaiBuddhistEra;


public class Punto {
    private int X;
    private int Y;

    public Punto(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
        public void MoverHorizontal (int Mover){
                this.X =+ Mover;
 }
        public void MoverVertical (int Mover){
                this.Y =+ Mover;       
    

}

    @Override
    public String toString() {
        return "Punto{" +  + X + ", " + Y + '}';
    }
}
