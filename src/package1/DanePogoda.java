/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author Kompik1
 */
public class DanePogoda {
    int id;
    double temperatura;
    double wilgotnosc;
    double cisnienie;
    String wiatr;
    String data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setWilgotnosc(double wilgotnosc) {
        this.wilgotnosc = wilgotnosc;
    }

    public void setCisnienie(double cisnienie) {
        this.cisnienie = cisnienie;
    }

    public void setWiatr(String wiatr) {
        this.wiatr = wiatr;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getWilgotnosc() {
        return wilgotnosc;
    }

    public double getCisnienie() {
        return cisnienie;
    }

    public String getWiatr() {
        return wiatr;
    }

    public String getData() {
        return data;
    }
    
}
