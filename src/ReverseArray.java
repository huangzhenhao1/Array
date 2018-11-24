class ReverseArray extends Array{
    public ReverseArray(int len){
        super(len);
    }
    public int[] getArray(){
        int t[] = new int[super.getArray().length];
        int count = t.length - 1;
        for(int x = 0; x < t.length; x++){
            t[count] = super.getArray()[x];
            count--;
        }
        return t;
    }
}
