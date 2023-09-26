public class Tree {
    private int height;
    private char myChar;

    public Tree(int height){
        if(height<0){
            height = 0;
        }
        this.height = height;
        this.myChar ='V';
    }

    public void setMyChar(char myChar){
        this.myChar=myChar;
    }

    public void grow(double rainInMm){
        if(rainInMm > 12){
            height++;
            System.out.println("We are growing!");
        }
    }

    public void draw(){
        for(int i = 0; i <= height; i++){
            for(int j = 0; j <= (height-i)/2; j++){
                System.out.print(' ');
            }
            for(int j = 1; j <= i; j++){
                System.out.print(myChar);
            }
            System.out.println();
        }
    }
}