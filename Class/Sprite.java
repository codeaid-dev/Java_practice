import java.util.Objects;

public class Sprite {
  private String name;
  private int type; //1:hero, 2:monster
  public Sprite(String name, int type) {
    this.name = name;
    this.type = type;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Sprite sprite = (Sprite) obj;
    return type == sprite.type && Objects.equals(name, sprite.name);
  }
  @Override
  public int hashCode() {
      return Objects.hash(name, type);
  }
}
