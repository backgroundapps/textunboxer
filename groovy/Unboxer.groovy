public class Unboxer {

  public enum TOKEN { PARENTHESYS, BRACKETS, BRACES }
  private String text
  private Unboxer unboxer
  
  private Unboxer() {}
  private Unboxer(String text)
  {
    this.text = text
  }
  
  public static Unboxer on(String text)
  {
    unboxer = new Unboxer(text)   
    unboxer
  }

  public static Unboxer splitedBy(TOKEN token) {return null}
  
  public static String run() {return null}
}
