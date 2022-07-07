public class Box <T>
{
   T data;

  public Box(T d)
  {
      data = d;
  }

  private T getData(T d)
  {
    return d;
  }
}
