package home.TicTacToe;

public enum ActionFigure {
 Krestik("  +  "), Nolik("  O  ");

 private String name;

 private ActionFigure(String name) {
  this.name = name;
 }

 public String getName() {
  return name;
 }

}
