class Starpatter{
    public static void main(String[] args) {
        // printing write angle trianle STAR PATTERN
        int n = 4;
        
        for(int row = 0; row <= n; row++){
            for(int column = 0; column <=row; column++){
                System.out.print("* ");
            }
            System.out.println("."); // I'm using . in this statement to make more visiblity of this lines execution
        }
    }
}
