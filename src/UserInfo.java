public class UserInfo {
    public String USERID;
    public int current_type;
    public int service_type;
    public int is_mix_service;
    public int online_time;
    public float total_fee_1;
    public float total_fee_2;
    public float total_fee_3;
    public float total_fee_4;
    public float month_traffic;
    public int many_over_bill;
    public int contract_type;
    public int contract_time;
    public int is_promise_low_consume;
    public int net_service;
    public int pay_times;
    public float pay_num;
    public float last_month_traffic;
    public float local_traffic_month;
    public float local_caller_time;
    public float service1_caller_time;
    public float service2_caller_time;
    public int gender;
    public int age;
    public int complaint_level;
    public int former_complaint_num;
    public float former_complaint_fee;
    public int current_service;

    public Calculator calculator;

    public UserInfo(String str,Calculator cal){
        String[] s=str.split(",");
        this.service_type=Integer.valueOf(s[0]);
        this.is_mix_service=Integer.valueOf(s[1]);
        this.online_time=Integer.valueOf(s[2]);
        this.total_fee_1=Float.valueOf(s[3]);
        this.total_fee_2=Float.valueOf(s[4]);
        this.total_fee_3=Float.valueOf(s[5]);
        this.total_fee_4=Float.valueOf(s[6]);
        this.month_traffic=Float.valueOf(s[7]);
        this.many_over_bill=Integer.valueOf(s[8]);
        this.contract_type=Integer.valueOf(s[9]);
        this.contract_time=Integer.valueOf(s[10]);
        this.is_promise_low_consume=Integer.valueOf(s[11]);
        this.net_service=Integer.valueOf(s[12]);
        this.pay_times=Integer.valueOf(s[13]);
        this.pay_num=Float.valueOf(s[14]);
        this.last_month_traffic=Float.valueOf(s[15]);
        this.local_traffic_month= Float.valueOf(s[16]);
        this.local_caller_time=Float.valueOf(s[17]);
        this.service1_caller_time=Float.valueOf(s[18]);
        this.service2_caller_time=Float.valueOf(s[19]);
        this.gender=Integer.valueOf(s[20]);
        this.age=Integer.valueOf(s[21]);
        this.complaint_level=Integer.valueOf(s[22]);
        this.former_complaint_num=Integer.valueOf(s[23]);
        this.former_complaint_fee=Float.valueOf(s[24]);
        this.current_service=Integer.valueOf(s[25]);
        this.USERID=s[26];

        this.calculator=cal;
        this.calculator.addGenda(this.current_service,this.contract_type);
    }
}
