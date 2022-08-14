package enums;

public enum HealthInsurance {
    LEVEL_ONE(1000, 1.0f),
    LEVEL_TWO(2000, 2.0f),
    LEVEL_THREE(3000, 3.2f),
    LEVEL_FOUR(4000, 4.5f),
    LEVEL_FIVE(5000, 5.6f),
    LEVEL_SIX(6000, 7.1f);

    HealthInsurance(int maxSalary, float ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    int maxSalary;
    float ratio;
    public float getRatio(){
        return this.ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary){
        if(salary<1000 && salary>0){
            return HealthInsurance.LEVEL_ONE;
        }else if(salary<2000 && salary>1000){
            return HealthInsurance.LEVEL_TWO;
        }else if(salary<4000 && salary>3000){
            return HealthInsurance.LEVEL_THREE;
        }else if(salary<5000 && salary>4000){
            return HealthInsurance.LEVEL_FOUR;
        }else if(salary<6000 && salary>5000){
            return HealthInsurance.LEVEL_FIVE;
        }else if(salary>6000){
            return HealthInsurance.LEVEL_SIX;
        }else{
            System.out.println("없는 값입니다");
            return null;
        }
    }

    public static void main(String[] args) {
        int salaryArray[] = new int[]{1500,5500,8000};
        HealthInsurance[] insurances = new HealthInsurance[3];
        insurances[0] = HealthInsurance.getHealthInsurance(salaryArray[0]);
        insurances[1] = HealthInsurance.getHealthInsurance(salaryArray[1]);
        insurances[2] = HealthInsurance.getHealthInsurance(salaryArray[2]);

        for (int loop = 0; loop < insurances.length; loop++) {
            System.out.println(salaryArray[loop]+"="+insurances[loop]+","+insurances[loop].getRatio());

        }

    }

}
