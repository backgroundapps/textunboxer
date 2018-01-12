public class Unboxer
{

  public enum TOKEN { PARENTHESYS, BRACKETS, BRACES }

  private static Unboxer unboxer

  private String text
  private Point point
  private TOKEN token
 
  private Unboxer() {}
  private Unboxer(String text)
  {
    this.text = text
  }

  public static Unboxer on(String text)
  {
    unboxer = new Unboxer(text) 
    return unboxer
  }

  public Unboxer splitedBy(TOKEN token)
  {
    unboxer.token = token
    unboxer
  }
  
  public String run()
  {
    unboxer.text.replace("(", "\n").replace(")", "\n")
  }

  class Point
  {
    String begin, end
  }
}

Unboxer.on("(1 + (1 + 1 - (2+2)))").splitedBy(Unboxer.TOKEN.PARENTHESYS).run()
