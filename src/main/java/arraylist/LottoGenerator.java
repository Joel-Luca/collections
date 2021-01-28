package arraylist;

import arraylist.interfaces.IIntList;

import java.util.Random;

public class LottoGenerator {

    public static IIntList generateLottoNumbers() {
        IIntList lottoNumbers = new IntArrayList();

        Random random = new Random();
        int rand_num = 0;

        while (lottoNumbers.size() != 6) {
            if(!lottoNumbers.contains(rand_num) && rand_num != 0) {
                lottoNumbers.add(rand_num);
            }
            else {
                rand_num = random.nextInt(42);
            }
        }
        return lottoNumbers;
    }

}
