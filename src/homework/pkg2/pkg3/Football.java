/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg2.pkg3;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
public class Football implements SourceFootball {
    private final ArrayList<MyObserver> list ;
    private String inputData ;
    
    public Football(){
        this.list = new ArrayList<MyObserver>();
    }
    public void setInputData(String inputData) {
        this.inputData = inputData ;
        notifyObservers();
    }
    public String getInputData(){
        return inputData ;
    }
   
    @Override
    public void register (MyObserver observer){
        list.add(observer);
    }
    
    @Override
    public void notifyObservers(){
        for (int n = 0; n < list.size(); n++){
            list.get(n).update(this);
        }
    }
}
