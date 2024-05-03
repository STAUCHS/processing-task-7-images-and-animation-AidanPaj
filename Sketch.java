import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  //making the stuff for charlie brown
  PImage imgCharlie;

  float fltCharlieX = 10;
  float fltCharlieY = 30;

  float fltSpeedCharlieX = 1;
  float fltSpeedCharlieY = 1;

  //making the stuff for the circle shape
  float fltCircleX = 25;
  float fltCircleY = 25;

  float fltSpeedCircleX = 2;
  float fltSpeedCircleY = 2;

  double dblGravityY = 0.25;
  double dblGravityX = 0.25;

  //making background variables
  PImage imgSnoopyback;

  float fltSnoopybackX = 0;
  float fltSnoopybackY = 0;

  //giving colour white a variable
  int white = color(255);

  public void settings() {
    size(400, 400);
  }

  public void setup() {
  // loading charlie brown
    imgCharlie = loadImage("Charlie.Brown.png");
  // resize charlie brown
    imgCharlie.resize(90, 90);
  //loading background
    imgSnoopyback = loadImage ("images.png");
  //resizing background
    imgSnoopyback.resize(400,400);
  
  }

  //making the animation come to life 
  public void draw() {
  image(imgSnoopyback, 0, 0);


  //animation for Charlie
   image(imgCharlie, fltCharlieX, fltCharlieY);

    fltCharlieX += fltSpeedCharlieX;
    fltCharlieY += fltSpeedCharlieY;

    fltSpeedCharlieY += dblGravityY;
    fltSpeedCharlieX += dblGravityX;

    if (fltCharlieX > width - imgCharlie.width || fltCharlieX < 0){
     fltSpeedCharlieX *= -1;

   }

    if (fltCharlieY > height - imgCharlie.height || fltCharlieY < 0){
     fltSpeedCharlieY*= -1;

   }
  
  //animation for circle
  fill(white);
  ellipse(fltCircleX, fltCircleY, 50, 50);

    fltCircleX += fltSpeedCircleX;
    fltCircleY += fltSpeedCircleY;

    fltSpeedCircleY += dblGravityY;

    if (fltCircleX > width - 25|| fltCircleY < 25){
    fltSpeedCircleX *= -1;
  }

    if (fltCircleY > height - 25|| fltCircleY < 25){
    fltSpeedCircleY*= -1;

    }
  }
}