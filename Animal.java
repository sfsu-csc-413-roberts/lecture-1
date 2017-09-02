public abstract class Animal {
  public void eat( Food food ) {
    // do something with food....
  }

  public void sleep( int hours ) {
    try {
      Thread.sleep ( 1000 * 60 * 60 * hours );
    } catch ( InterruptedException ie ) {
      /* ignore */
    }
  }

  public abstract void makeNoise();
}

public class Dog extends Animal {
  @Overrides
  public void makeNoise() {
    System.out.println( "Bark! Bark!" );
  }
}

public class Cow extends Animal {
  @Overrides
  public void makeNoise() {
    System.out.println( "Moo! Moo!" );
  }
}
