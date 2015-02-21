package ap2014.t2.assignment2;


public class Light {
  private boolean on;
  private boolean burntOut;
  private String color;

  public Light() {
    this(true, false, "white");
  }

  public Light(boolean o, boolean b, String c) {
    on = b ? false : o;
    burntOut = b;
    color = validColor(c);
  }

  public void flip() {
    if (burntOut) {
      on = false;
    } else {
      on = !on;
    }
  }

  public String getColor() {
    return color;
  }

  public void setColor(String c) {
    color = validColor(c);
  }

  public boolean isOn() {
    return on;
  }

  public void burnOut() {
    burntOut = true;
    on = false;
  }

  @Override
  public String toString() {
    return (on ? "on " : "off ") + color + "\t" + (burntOut ? "burnt out" : "not burnt out");

  }

  private static String validColor(String c) {
    c = c == null ? "white" : c.toLowerCase();
    if (!("red".equals(c) || "green".equals(c) || "blue".equals(c))) {
      c = "white";
    }
    return c;
  }


  public static void main(String[] args) {

        /* The main method allows you to run Light on its own, with a built-in tester. */

    //*************************************************************************
    // 1. Test Light()
    //*************************************************************************
    Light light1 = new Light();
    System.out.println("1. Test Light()");
    testLight(light1, true, false, "white", "on white\tnot burnt out");
    //*************************************************************************
    // 2. Test Light(boolean b, boolean o, String c)
    //*************************************************************************
    System.out.println("\n2. Test Light(boolean b, boolean o, String c)");
    Light light2 = new Light(true, true, "GreeN");
    // Notice that since the light bulb is "burnt out", the value of "on"
    // gets set to false. Also, the color should get saved in all lower case
    // as "green", not "GreeN".
    testLight(light2, false, true, "green", "off green\tburnt out");


    //*************************************************************************
    // 3. Test burnOut()
    //*************************************************************************
    System.out.println("\n3. Test burnOut()");
    // light1 is not burnt out. Lets call burnOut on light1 and make sure it gets burnt out and turned off
    light1.burnOut();
    testLight(light1, false, true, "white", "off white\tburnt out");


    //*************************************************************************
    // 4. Test flip()
    //*************************************************************************
    System.out.println("\n4. Test flip()");
    Light light3 = new Light();
    // light3 is currently on and not burnt out.  Lets flip the light off and on and see if it works properly.
    System.out.println("light3 is on");
    testLight(light3, true, false, "white", "on white\tnot burnt out");
    light3.flip();
    System.out.println("now light3 should be off");
    testLight(light3, false, false, "white", "off white\tnot burnt out");
    light3.flip();
    System.out.println("now light3 should be back on");
    testLight(light3, true, false, "white", "on white\tnot burnt out");
    // Try to flip light1 on - this should fail since light1 is burnt out. light1 should stay off
    System.out.println("light1 is burned out and off, we can't flip it on");
    light1.flip();
    testLight(light1, false, true, "white", "off white\tburnt out");

    //*************************************************************************
    // 5. Test isOn()
    //*************************************************************************
    System.out.println("\n5. Test isOn()");
    // We know light1 is off, and light3 is on.  Verify that the method isOn reports this correctly.
    if (!light1.isOn()) {
      System.out.println("*** PASS: isOn() working properly");
    } else {
      System.out.println("*** FAIL: isOn() not working properly");
    }
    if (light3.isOn()) {
      System.out.println("*** PASS: isOn() working properly");
    } else {
      System.out.println("*** FAIL: isOn() not working properly");
    }

    //*************************************************************************
    // 6. Test getColor()
    //*************************************************************************
    System.out.println("\n6. Test getColor()");
    if (light1.getColor().equals("white")) {
      System.out.println("*** PASS: getColor() working properly");
    } else {
      System.out.println("*** FAIL: problem with getColor()");
    }

    //*************************************************************************
    // 7. Test setColor(String)
    //*************************************************************************
    System.out.println("\n7. Test setColor(String)");
    light1.setColor("red");
    System.out.println("*** " + testLightColor(light1, "red"));
    light1.setColor("BLUE");  // should set light to blue
    System.out.println("*** " + testLightColor(light1, "blue"));
    light1.setColor("yellow"); // yellow is not allowed, should set light to white
    System.out.println("*** " + testLightColor(light1, "white"));
  }

  // Private helper methods

  private static void testLight(Light light, boolean o, boolean b, String c,
                                String string) {
    System.out.println("*** " + testLightOn(light, o));
    System.out.println("*** " + testLightburntOut(light, b));
    System.out.println("*** " + testLightColor(light, c));
    System.out.println("*** " + testLightToString(light, string));
  }

  private static String testLightOn(Light bulb, boolean o) {
    if ((bulb.on && !o) || (!bulb.on && o)) {
      return "FAIL: on is not set correctly. on should be set to "
          + o + ", but it is set to " + bulb.on + ".";
    } else {
      return "PASS: on is set correctly (" + bulb.on + ")";
    }
  }

  private static String testLightburntOut(Light light, boolean b) {
    if ((light.burntOut && !b) || (!light.burntOut && b)) {
      return "FAIL: burntOut is not set correctly (burntOut should be set to "
          + b + ", but it is set to " + light.burntOut + ")";
    } else {
      return "PASS: burntOut is set correctly (" + light.burntOut + ")";
    }
  }

  private static String testLightColor(Light light, String c) {
    if (!light.color.equals(c)) {
      return "FAIL: color is not set correctly (color should be set to "
          + c + ", but it is set to " + light.color + ")";
    } else {
      return "PASS: color is set correctly (" + light.color + ")";
    }
  }

  private static String testLightToString(Light light, String string) {
    String output;

    if (light.toString().equals(string)) {
      output = "PASS: toString produced the correct output";
    } else {
      output = "FAIL: toString does not work as expected";
    }
    return output + " (" + light.toString() + ")";
  }
}
