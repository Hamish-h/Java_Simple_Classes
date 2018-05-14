public class Water_bottle {
    private int volume = 100;

    public void drink(){
        this.volume -=10;
    }

    public void fill(){
        this.volume = 100;
    }

    public void empty(){
        this.volume = 0;
    }

    public int getVolume() {
        return this.volume;
    }

}

