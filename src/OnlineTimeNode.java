public class OnlineTimeNode {
    private double low;
    private double high;
    private MonthTrafficNode[] monthTrafficNodes;

    public OnlineTimeNode(double low,double high){
        this.low=low;
        this.high=high;
        this.monthTrafficNodes=new MonthTrafficNode[60];
        for(int i=0;i<60;i++){
            this.monthTrafficNodes[i]=new MonthTrafficNode(100*i,100*(i+1));
        }
    }
    public void select(String[] ref,boolean isFinal){
        this.monthTrafficNodes[(int)((Double.valueOf(ref[7]))/10)].select(ref,isFinal);
    }
}
