public class MonthTrafficNode {
    private double low;
    private double high;
    private PayNumNode[] payNumNode;

    public MonthTrafficNode(double low,double high){
        this.low=low;
        this.high=high;
        this.payNumNode=new PayNumNode[80];
        for(int i=0;i<80;i++){
            this.payNumNode[i]=new PayNumNode(10*i,10*(i+1));
        }
    }
    public void select(String[] ref,boolean isFinal){
        this.payNumNode[(int)((Double.valueOf(ref[14]))/10)].select(ref,isFinal);
    }
}
