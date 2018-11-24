class SortArray extends Array{
    public SortArray(int len){
        super(len);
    }
    public int[] getArray(){
        java.util.Arrays.sort(super.getArray());
        return super.getArray();
    }
}