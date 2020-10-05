package edu.upc.eetac.dsa.OO.figuras;

public class Rectangle extends Figura {

    private double l1;
    private double l2;

    public Rectangle(double l1,double l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    public double area()    //calcula area rectangle i la retorna
    {return this.l1 * this.l2; }


    @Override           //posem el toString pq sigui llegible per un humà
    public String toString() {return "Rectangle l1:" +this.l1 + "l2:" +this.l2 + "area: (("+this.area()+"))"; }

}
