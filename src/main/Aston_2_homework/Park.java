/*3. Создать класс Park с внутренним классом,
        с помощью объектов которого можно хранить информацию об аттракционах,
        времени их работы и стоимости.*/

package Aston_2_homework;

import java.math.BigDecimal;

public class Park {
    String openingHours;
    BigDecimal fullPrice;

    class RollerCoaster {
        BigDecimal price;
        String rules;
        String information;
        String type;
    }

    class FerrisWheel {
        BigDecimal price;
        String rules;
        String information;
        String type;
    }

    class Carousel {
        BigDecimal price;
        String rules;
        String information;
        String type;
    }

    class DropTower {
        BigDecimal price;
        String rules;
        String information;
        String type;
    }

    public class KiddieRide {
        BigDecimal price;
        String rules;
        String information;
        String type;
    }
}

