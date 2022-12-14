public class Parallelepiped{


    private int length;
    private int height;
    private int width;


    public Parallelepiped(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public void getArea(){
        System.out.println(2*(height*length)+(length*width)+(height*width));
    }

    public void getVolume(){
        System.out.println(length*width*height);
    }



}
