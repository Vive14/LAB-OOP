public class P1 {
    public static void main(String[] args) {
        int population = 312032486;    
        int secconyear = 31536000;
        int birth, death, immigrant;
        
        birth = secconyear / 7;
        death = secconyear / 13;
        immigrant = secconyear / 45;

        population += (birth + immigrant - death);
        System.out.println("Year_1 = " + population);

        population += (birth + immigrant - death);
        System.out.println("Year_2 = " + population);

        population += (birth + immigrant - death);
        System.out.println("Year_3 = " + population);

        population += (birth + immigrant - death);
        System.out.println("Year_4 = " + population);

        population += (birth + immigrant - death);
        System.out.println("Year_5 = " + population);


    }

    
}