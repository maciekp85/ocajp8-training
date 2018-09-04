package test;

public class IdentifyMyPartsTest {

  public static void main(String[] args) {
    IdentifyMyParts a = new IdentifyMyParts(  );
    IdentifyMyParts b = new IdentifyMyParts(  );
    a.x = 1;
    b.x = 2;
    a.x = 5;
    a.y = 3;
    b.y = 4;
    System.out.println(IdentifyMyParts.x);
  }
}
