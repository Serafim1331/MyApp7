public class Main {
    public static void main(String[] args) {
        String [][] array = {
                {"33","5","0","43"},
                {"34","9","4","63"},
                {"3","2","9","4"},
                {"78","5","31","5"}
        };
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        try{
            int result = calculator.doCalc(array);
            System.out.println("Рузультат: "+result);
        }catch (ArraySizeException e){
            System.err.println(e.getMessage());
        }catch (ArrayDataException e){
            System.err.println(e.getMessage());
        }
    }
}