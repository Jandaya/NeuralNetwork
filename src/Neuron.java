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
    
    private String location;
    
    public Neuron(){
        latitude = 0.0;
        longitude = 0.0;
        location = "";
        latitudeWeight = 1.0;
        longitudeWeight = 1.0;
    }
    
    public Neuron(double lat, double lon, String loc, double law, double low){
        latitude = lat;
        longitude = lon;
        location = loc;
        latitudeWeight = law;
        longitudeWeight = low;
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
}
