public class Thing {

   private String obj; private int weight;
    
    
    public Thing(String obj, int weight) {
        
        this.obj = obj;
        this.weight = weight;
        
    }

    public String getName() {
        return this.obj;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return  this.getName() + " " + this.weight;

    }
}
