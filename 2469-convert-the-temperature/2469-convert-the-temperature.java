class Solution {
    public double[] convertTemperature(double celsius) {
        double[] arr1= new double[2];
        arr1[0]=celsius+273.15;
        arr1[1]=celsius*1.80+32.00;
        return arr1;
    }
}