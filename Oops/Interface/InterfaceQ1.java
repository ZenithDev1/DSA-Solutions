class InterfaceQ1 {
    public static void main(String[] args) {
      Pig myPig = new Pig();
      myPig.Sound();
      myPig.sleep();
    }
  }
  
interface Animal {
    public void Sound();
    public void sleep(); // interface method (does not have a body)
  }
  
  class Pig implements Animal {
    public void Sound() {
      System.out.println("The pig says: wee wee");
    }

    public void sleep() {
      System.out.println("Zzz");
    }
  }
