public class TypeTag {
    public int tag;
    public int[] gender = new int[2];
    public float[] month_traffic_record=new float[100000];
    public float month_traffic_average;
    public int num;

    public TypeTag(int i) {
        this.tag = i;
        this.num=0;
    }

    public void addGender(int i,float j) {
        if (i == 1) {
            gender[0]++;
        } else if (i == 2) {
            gender[1]++;
        }
        this.month_traffic_record[this.num++]=j;
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
}