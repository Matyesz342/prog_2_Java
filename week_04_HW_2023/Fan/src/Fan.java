public class Fan {
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isOn() {
        return on;
    }
    public Fan()
    {
        this.color = color;
        this.radius = radius;
        this.on = on;
        this.speed = speed;
    }
    public String toString() {
        if (on) {
            return "Sebesség: " + speed + "\nSzín: " + color + "\nSugár: " + radius + "\n";
        }
        else
        {
            return "Szín: "+color+"\nSugár: "+radius+"\nFan is off.";
        }

    }

    public boolean equals(Fan F1)
    {
        if (this.radius == F1.radius && this.color.equals(F1.color))
        {
            return true;
        }
        return false;
    }
}
