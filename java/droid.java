//  Create a simple Droid (robot) that can be activated, charged, and hover above ground.

public class Droid {
  
  int batteryLevel;
  public Droid() {
    batteryLevel = 100;
  }
  
  void activate() { 
  System.out.println("Droid activated. How can I help you?");
  batteryLevel = batteryLevel-5;
    System.out.println("Battery level: "+batteryLevel+ "%");
  }
  void chargeBattery(int hours) {
    System.out.println("Droid charging...");
   	batteryLevel = batteryLevel+hours;
    if (batteryLevel > 100) {
      batteryLevel = 100;
      System.out.println("Battery level: "+batteryLevel + "%");
    }
    else {
      System.out.println("Battery level: "+batteryLevel + "%");
    }
  }
  int checkBatteryLevel() {
    System.out.println("Battery level: "+batteryLevel+"%");
    return batteryLevel;
  }
  void hover(int feet) {
    if (feet > 2) {
      System.out.println("Error! I cannot hover above 2 feet.");
    }
    else {
      System.out.println("Hovering...");
      batteryLevel = batteryLevel - 20;
      System.out.println("Battery level: "+batteryLevel+ "%");
    }
  }
  
  public static void main(String[] args){
    Droid myDroid = new Droid();
    myDroid.activate();
   	myDroid.chargeBattery(5);
    myDroid.hover(2);
  }
}
