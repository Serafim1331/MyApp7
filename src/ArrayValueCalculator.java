public class ArrayValueCalculator {
    public  int doCalc(String[][] array) throws ArraySizeException,ArrayDataException{
        if (array.length != 4) {
            throw new ArraySizeException("Массив должен иметь размер 4x4");
        }
        for(int i =0; i < array.length;i++){
            if(array[i].length != 4){
                throw new ArraySizeException("Массив должен иметь размер 4x4");
            }
        }
        int sum = 0;
        for(int i = 0;i < array.length;i++){
            for(int j = 0; j< array[i].length; j++){
                try{
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                }catch (NumberFormatException e){
                    throw new ArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
