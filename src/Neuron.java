

/**
 *
 * @author Joseph
 */
public class Neuron {
    private double latitude;
    private double longitude;
    
    private String location;
    
    public Neuron(){
        latitude = 0.0;
        longitude = 0.0;
        location = "";
    }
    
    public Neuron(double lat, double lon, String loc){
        latitude = lat;
        longitude = lon;
        location = loc;
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
    
    public double getLatitude(){
        return latitude;
    }
    public double getLongitude(){
        return longitude;
    }
    public String getLocation(){
        return location;
    }
}
