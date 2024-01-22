/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Stephen M. Burns 
 * @version 2024.01.22
 */
public class Picture
{
    
    private Triangle pyramid1;
    private Triangle pyramid2;
    private Triangle pyramid3;
    private Triangle pyramid4;
    
    private Circle ball1;
    private Circle ball2;
    private Circle ball3;
    
    private Person priest1;
    private Person priest2;
    private Person priest3;
    
    private Square sky;
    private Square step1;
    private Square step2;
    private Square step3;
    
    
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {

        
        pyramid1= new Triangle();
        pyramid2 = new Triangle();
        pyramid3 = new Triangle();
        pyramid4 = new Triangle();
        
        ball1 = new Circle();
        ball2 = new Circle();
        ball3 = new Circle();
        
        priest1 = new Person();
        priest2 = new Person();
        priest3 = new Person();
        
        sky = new Square();
        step1 = new Square();
        step2 = new Square();
        step3 = new Square();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            sky.changeColor("black");
        
            pyramid1.changeColor("blue");
            pyramid2.changeColor("yellow");
            pyramid3.changeColor("red");
            
            ball1.changeColor("green");
            ball2.changeColor("green");
            ball3.changeColor("green");
            
            pyramid1.makeVisible();
            pyramid2.makeVisible();
            pyramid3.makeVisible();
            
            ball1.makeVisible();
            ball2.makeVisible();
            ball3.makeVisible();
            
            sky.makeVisible();
            
            ball1.changeSize(20);
            ball2.changeSize(40);
            ball3.changeSize(60);
            
            pyramid1.moveVertical(-20);
            pyramid2.moveVertical(-40);
            pyramid3.moveVertical(-60);
            
            pyramid1.moveHorizontal(-120);
            pyramid2.moveHorizontal(-140);
            pyramid3.moveHorizontal(-160);
            
            ball1.moveHorizontal(20);
            ball2.moveHorizontal(40);
            ball3.moveHorizontal(80);
        

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {

 
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {


    }
}
