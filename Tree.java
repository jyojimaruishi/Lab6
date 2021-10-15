//Name, tree type, loses leaves? current leaf color
//Instance variables private
//First Constructor should set to: "", false, or 0
//Second Constructor should allow for 4 parameters
//We need: getter and setter for each instance variable
//Print Method

class Tree{

  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree(){
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor){
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }

  void setName(String aName){
    treeName = aName;
  }

  String getName(){
    return treeName;
  }

  void setType (String aType){
    treeType = aType;
  }

  String getType(){
    return treeType;
  }

  void setFall(boolean aFall){
    leavesFall = aFall;
  }

  boolean getFall(){
    return leavesFall;
  }

  void setColor(String aColor){
    leafColor = aColor;
  }

  String getColor(){
    return leafColor;
  }

  String falls(){
    if(getFall() == true){
      return "does";
    }
    else{
      return "does not";
    }
  }

  void print(){
    
    System.out.println("This is a " + getName() + " tree. It is a " + getType() + " and its leaves are currently " + getColor() + ". It " + falls() + " lose its leaves for the winter.");
  }
}