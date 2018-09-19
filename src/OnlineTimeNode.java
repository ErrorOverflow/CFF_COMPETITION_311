public class OnlineTimeNode {
    public MonthTrafficNode[] monthTrafficNodes;

    public OnlineTimeNode(){
        this.monthTrafficNodes=new MonthTrafficNode[30];
        for(int i=0;i<30;i++){
            this.monthTrafficNodes[i]=new MonthTrafficNode();
        }
    }
    public void select(String[] ref,boolean isFinal){
        if(isFinal){
            for(int i=0;i<30;i++){
                this.monthTrafficNodes[i].select(ref,true);
            }
            return ;
        }
        try{
            this.monthTrafficNodes[(int)((Double.valueOf(ref[7]))/200)].select(ref,false);
        }catch(Exception e){
            this.monthTrafficNodes[30-1].select(ref,false);
        }
    }
}
