public class TypeTag {
    public int tag;
    public int[] gender = new int[2];
    public float[] month_traffic_record=new float[100000];
    public float month_traffic_average;
    public int num;
    public double age_average;
    public double local_caller_time;

    public TypeTag(int i) {
        this.tag = i;
        this.num=0;
        this.age_average=0;
        this.local_caller_time=0;
    }

    public void add(float i){
        this.num++;
        this.local_caller_time+=i;
    }

    public int[] getGender() {
        return gender;
    }

    public int getTag() {
        return tag;
    }

    public float getMonth_traffic_average() {
        for(int i=0;i<num;i++){
            month_traffic_average+=month_traffic_record[i];
        }
        return (month_traffic_average/num);
    }

    public double getAge_average() {
        return (age_average/num);
    }

    public double getLocal_caller_time() {
        return local_caller_time/num;
    }
}