abstract class UserInfo {
    private String USERID;
    private int current_type;
    private int service_type;
    private int is_mix_service;
    private int online_time;
    private float total_fee_1;
    private float total_fee_2;
    private float total_fee_3;
    private float total_fee_4;
    private float month_traffic;
    private int many_over_bill;
    private int contract_type;
    private int contract_time;
    private int is_promise_low_consume;
    private int net_service;
    private int pay_times;
    private float pay_num;
    private float last_month_traffic;
    private float local_traffic_month;
    private float local_caller_time;
    private float service1_caller_time;
    private float service2_caller_time;
    private int gender;
    private int age;
    private int complaint_level;
    private int former_complaint_num;
    private float former_complaint_fee;
    private int current_service;

    private Calculator calculator;

    private UserInfo(String str,Calculator cal){
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
