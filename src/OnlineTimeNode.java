public class OnlineTimeNode {
    public MonthTrafficNode[] monthTrafficNodes;

    public OnlineTimeNode(){
        this.monthTrafficNodes=new MonthTrafficNode[60];
        for(int i=0;i<60;i++){
            this.monthTrafficNodes[i]=new MonthTrafficNode();
        }
    }
    public void select(String[] ref,boolean isFinal){
        if(isFinal){
            for(int i=0;i<60;i++){
                this.monthTrafficNodes[i].select(ref,true);
            }
            return ;
        }
        try{
            this.monthTrafficNodes[(int)((Double.valueOf(ref[7]))/100)].select(ref,false);
        }catch(Exception e){}
    }
}
