/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joseph
 */
public class Neuron {
    private double latitude;
    private double longitude;
    private double latitudeWeight;
    private double longitudeWeight;
    private int correct;
    
    private String location;
    
    public Neuron(){
        latitude = 0.0;
        longitude = 0.0;
        location = "";
        latitudeWeight = 1.0;
        longitudeWeight = 1.0;
        correct = 0;
    }
    
    public Neuron(String loc){
        latitude = 0.0;
        longitude = 0.0;
        location = loc;
        latitudeWeight = 1.0;
        longitudeWeight = 1.0;
        correct = 0;
    }
    
    public Neuron(double lat, double lon, String loc, double law, double low, int cor){
        latitude = lat;
        longitude = lon;
        location = loc;
        latitudeWeight = law;
        longitudeWeight = low;
        correct = cor;
    }
    
    
    public void setLatitude(double lat){
        latitude = lat;
    }
    
    public void setLongitude(double lon){
        longitude = lon;
    }
    
    public void setLocation(String loc){
        location = loc;
    }
    
    public void setLatitudeWeight(double a){
        latitudeWeight = a;
    }
    
    public void setLongitudeWeight(double b){
        longitudeWeight = b;
    }
    
    public void setCorrect(int c){
        correct = c;
    }
    
    public double getLatitude(){
        return latitude;
    }
    
    public double getLongitude(){
        return longitude;
    }
    public String getLocation(){
        return location;
    }
    public double getLatitudeWeight(){
        return latitudeWeight;
    }
    public double getLongitudeWeight(){
        return longitudeWeight;
    }
    
    public int getCorrect(){
        return correct;
    }
}
