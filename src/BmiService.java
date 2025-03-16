public class BmiService {
    public int calculate (int weightKg,double heightM) {
        double Bmi = weightKg/(heightM*heightM);
    return (int) Bmi;


}
}