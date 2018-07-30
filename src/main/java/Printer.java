public class Printer {
    private int papersheets;
    private int tonervolume;

    public Printer(int papersheets, int tonervolume){
        this.papersheets = papersheets;
        this.tonervolume = tonervolume;
    }

    public int getPapersheets(){
        return this.papersheets;
    }

    public int getTonervolume(){
        return this.tonervolume;
    }

    public void print(int pages, int copies){
        if(this.papersheets >= (pages * copies) && this.tonervolume >= (pages * copies)){
            this.papersheets -= (pages * copies);
            this.tonervolume -= (pages * copies);
        }
    }

    public void refill(int pages){
        this.papersheets += pages;
    }
}
