class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();
    Tree tree2 = new Tree("Maple", "Broadleaf", true, "Red");

    tree1.print();
    tree2.print();

    tree1.setName("Spruce");
    tree1.setType("Conifer");
    tree1.print();
  }
}