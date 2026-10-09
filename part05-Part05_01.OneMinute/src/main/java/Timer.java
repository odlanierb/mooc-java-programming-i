/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author odlanierbermudez
 */
public class Timer {
    private ClockHand centecim;
    private ClockHand seconds;
    
    public Timer(){
        this.centecim = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance(){
        centecim.advance();
        if(centecim.value() == 0){
            seconds.advance();
        }
    }
    
    public String toString(){
        return seconds + ":" + centecim;
    }
    
}
