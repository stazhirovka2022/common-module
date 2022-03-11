package liga.medical;

import lombok.Data;

/**
 * Медицинские данные.
 */
@Data
public class MedicalData {

    /**
     * Температура.
     */
    private Double temperature;

    /**
     * Давление.
     */
    private Double pressure;

    /**
     * Уровень глюкозы.
     */
    private Double glucoseLevel;

    /**
     * Пульс.
     */
    private Integer pulse;
}
