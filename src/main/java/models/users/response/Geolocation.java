package models.users.response;

public class Geolocation {
    private String lat;
    private String _long; // "long" — неудобное имя, поэтому так

    public String getLat() { return lat; }
    public void setLat(String lat) { this.lat = lat; }

    public String getLong() { return _long; }
    public void setLong(String _long) { this._long = _long; }
}
