package berlin.yuna.hackerschool.example;

import berlin.yuna.tinkerforgesensor.model.SensorList;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Sensor;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Sensor.LedStatusType;
import berlin.yuna.tinkerforgesensor.model.type.ValueType;
import berlin.yuna.tinkerforgesensor.util.TinkerForgeUtil;
import com.tinkerforge.BrickletLCD20x4;

import java.awt.Color;
import java.util.List;
import java.util.Random;

import static berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Sensor.LedStatusType.LED_STATUS_OFF;
import static berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Sensor.LedStatusType.LED_STATUS_ON;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.BUTTON_PRESSED;
import static java.lang.String.format;
import static java.util.Collections.reverse;

public class TODO_SORT_OLD_EXAMPLES extends TinkerForgeUtil {

    private static LedStatusType status = LED_STATUS_ON;

    public static void animateStatusLEDs(final SensorList<Sensor> sensorList) {
        status = status == LED_STATUS_ON ? LED_STATUS_OFF : LED_STATUS_ON;
        final List<Sensor> sortedList = sensorList.filter(Sensor::hasLedStatus);
        if (status == LED_STATUS_OFF) {
            reverse(sortedList);
        }
        for (Sensor sensor : sortedList) {
            if (sensor.hasLedStatus() && sensor.isBrick()) {
                sensor.ledStatus(status.bit);
                sleep(128);
            }
        }
    }

    public static void displayAlphabet(final SensorList<Sensor> sensorList, final long speedMs) {
        final Sensor display = sensorList.getDisplaySegment();
        if (display.isPresent()) {
            for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
                display.value(Character.toString(alphabet));
                sleep(speedMs);
            }
        }
    }

    public static void displayTimeoutMessage(final SensorList<Sensor> sensorList, final long timeoutMs) {
        try {
            final Sensor sensor = sensorList.getDisplayLcd20x4();
            if (isPresent(sensor)) {
                final BrickletLCD20x4 device = (BrickletLCD20x4) sensor.device;
                device.setDefaultText((short) 0, "|                  |");
                device.setDefaultText((short) 1, "|   HackerSchool   |");
                device.setDefaultText((short) 2, "|  Ready to serve  |");
                device.setDefaultText((short) 3, "|                  |");
                device.setDefaultTextCounter((int) timeoutMs);
            }
            sleep(timeoutMs - 1000);
        } catch (Exception e) {
            System.err.println(format("[%s] [%s] [%s]", TODO_SORT_OLD_EXAMPLES.class.getSimpleName(), e.getClass().getSimpleName(), e.getMessage()));
        }
    }

    public static void RgbButtonChangeColorOnPress(final Sensor sensor, final ValueType valueType) {
        if (valueType.is(BUTTON_PRESSED)) {
            final Random random = new Random();
            final int r = random.nextInt(255);
            final int g = random.nextInt(255);
            final int b = random.nextInt(255);
            sensor.value((long) new Color(r, g, b).getRGB());
        }
    }
}