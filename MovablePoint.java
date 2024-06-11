public class MovablePoint extends Point {
    
        public float xSpeed;
        public float ySpeed;
        
    
        
        public MovablePoint(float x, float y, float xSpeed, float ySpeed){
            super (x,y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public MovablePoint(){
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    
        public float getXSpeed(){
            return  xSpeed;
        }

        public void setXSpeed(float xSpeed){
            this.xSpeed = xSpeed;
        }
        public float getYSpeed(){
            return ySpeed;
        }
        public void setYSpeed(float ySpeed){
            this.ySpeed = ySpeed;
        }
    
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
        
    
     @Override
     public String toString(){
        return  "(" + getX() + ", " + getY()+ ")" + "speed = (" + xSpeed + "," + ySpeed +")";
    }

public MovablePoint move (){
    setX(getX() + xSpeed);
    setY(getY() + ySpeed);
    return this;
}
    }

