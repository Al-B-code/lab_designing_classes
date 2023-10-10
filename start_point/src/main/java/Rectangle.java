public class Rectangle {

    private int length;

    private int width;

    public Rectangle(int length, int width){

        this.length = length;
        this.width = width;

    }

    int area(){

        int area = this.length * this.width;
        return area;
    }

    boolean isSquare(){

        if (this.length == this.width){
            return true;
        }
        else{
            return false;
        }
    }


}
