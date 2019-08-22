//1. Make a variable to hold the X co-ordinate of the dot and set it to 50.
int name =50;
void setup() {
    size(1000, 1000);
}

void draw() {
    //3. make the ellipse a nice color
    fill(#0D0C0C);
    //4. If the mouse is pressed change the X co-ordinate so that the dot moves to the right
    if(mousePressed){    
       name=name+50;
    }
      //5. Make your dot move faster
    //  (you have to figure out what part of your code to change)
ellipse (name,100,190,190);
    //2. Draw an e0lipse of height and width 10. Make sure to use your variable for the X position.
     
    //6. Use the playSound() method to play a ding when your dot crosses the finish line. 
}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
}
