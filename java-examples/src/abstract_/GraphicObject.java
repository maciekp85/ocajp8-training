package abstract_;

public abstract class GraphicObject {

  int x, y;

  void moveTo(int newX, int newY) {

  }
  abstract protected void draw();
  abstract void resize();
}
