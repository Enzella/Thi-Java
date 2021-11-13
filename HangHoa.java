/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class HangHoa {

    public HangHoa(double Ma, double Nam, double Dongia, String Ten) {
        this.Ma = Ma;
        this.Nam = Nam;
        this.Dongia = Dongia;
        this.Ten = Ten;
    }

    public double getMa() {
        return Ma;
    }

    public double getNam() {
        return Nam;
    }

    public double getDongia() {
        return Dongia;
    }

    public String getTen() {
        return Ten;
    }

    public void setMa(double Ma) {
        this.Ma = Ma;
    }

    public void setNam(double Nam) {
        this.Nam = Nam;
    }

    public void setDongia(double Dongia) {
        this.Dongia = Dongia;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }
    double Ma,Nam,Dongia;
    String Ten;
    
}
