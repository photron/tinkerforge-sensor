package berlin.yuna.tinkerforgesensor.model.sensor;

import berlin.yuna.tinkerforgesensor.model.exception.NetworkConnectionException;
import berlin.yuna.tinkerforgesensor.util.SegmentFormatter;
import com.tinkerforge.BrickletSegmentDisplay4x7;
import com.tinkerforge.Device;
import com.tinkerforge.TinkerforgeException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

import static berlin.yuna.tinkerforgesensor.model.sensor.Sensor.LedStatusType.LED_ADDITIONAL_OFF;
import static berlin.yuna.tinkerforgesensor.model.sensor.Sensor.LedStatusType.LED_ADDITIONAL_ON;
import static berlin.yuna.tinkerforgesensor.model.sensor.Sensor.LedStatusType.LED_NONE;
import static berlin.yuna.tinkerforgesensor.model.type.ValueType.DEVICE_TIMEOUT;
import static java.time.format.DateTimeFormatter.ofPattern;

/**
 * <h3>{@link DisplaySegment}</h3><br />
 * <i>Four 7-segment displays with switchable colon</i><br />
 *
 * <h3>Technical Info</h3>
 * <ul>
 * <li><a href="https://www.tinkerforge.com/en/doc/Hardware/Bricklets/Segment_Display_4x7.html">Official documentation</a></li>
 * <li><a href="https://en.wikichip.org/wiki/seven-segment_display/representing_letters">Representing Letters</a></li>
 * <li><a href="https://www.systutorials.com/4670/ascii-table-and-ascii-code">ascii-table-and-ascii-code">ascii-table-and-ascii-code</a></li>
 * </ul>
 * <h6>Send text to display</h6>
 * <code>display.send("GIRL");</code>
 * <h6>Send current time</h6>
 * <i>(use {@link TemporalAccessor})</i><br/>
 * <code>display.send(LocalDateTime#now());</code>
 * <h6>Send own time format</h6>
 * <i>(use {@link DateTimeFormatter})</i><br/>
 * <code>display.send(DateTimeFormatter.ofPattern("HH:mm"));</code>
 * <h6>LED Brightness (2-9)</h6>
 * <code>display.ledAdditional(7);</code>
 * <h6>Display ON</h6>
 * <code>display.ledAdditional_setOn;</code>
 */
public class DisplaySegment extends Sensor<BrickletSegmentDisplay4x7> {

    private static final int DIGIT_LIMIT = 4;
    private short brightness = 5;
    private Object lastText = ' ';
    private DateTimeFormatter timeFormatter = ofPattern("HH:mm");

    public DisplaySegment(final Device device, final String uid) throws NetworkConnectionException {
        super((BrickletSegmentDisplay4x7) device, uid);
    }

    @Override
    protected Sensor<BrickletSegmentDisplay4x7> initListener() {
        return this;
    }

    @Override
    public Sensor<BrickletSegmentDisplay4x7> send(final Object value) {
        try {
            final SegmentFormatter sf = new SegmentFormatter(value, lastText, timeFormatter, DIGIT_LIMIT);
            final short[] digits = toSegments(sf.getDigits());
            final boolean colon;
            timeFormatter = sf.getDateTimeFormatter();
            lastText = brightness == 0 ? lastText : value;

            if (value instanceof TemporalAccessor) {
                if (sf.isBlinkColon()) {
                    colon = (((LocalDateTime) value).getSecond() % 2 == 0) ? false : true;
                } else {
                    colon = false;
                }
            } else {
                colon = sf.getColons()[0];
            }

            device.setSegments(digits, brightness, colon);
            lastText = brightness == 0? lastText : value;
        } catch (TinkerforgeException ignored) {
            sendEvent(DEVICE_TIMEOUT, 404L);
        }
        return this;
    }

    @Override
    public Sensor<BrickletSegmentDisplay4x7> setLedStatus(final Integer value) {
        return this;
    }

    @Override
    public Sensor<BrickletSegmentDisplay4x7> ledAdditional(final Integer value) {
        if (value == LED_ADDITIONAL_ON.bit) {
            setBrightness((short) 7);
        } else if (value == LED_ADDITIONAL_OFF.bit) {
            setBrightness((short) 0);
        } else {
            setBrightness((short) (value.shortValue() - 2));
        }
        return this;
    }

    @Override
    public Sensor<BrickletSegmentDisplay4x7> initLedConfig() {
        ledStatus = LED_NONE;
        ledAdditional = LED_ADDITIONAL_OFF;
        return this;
    }

    @Override
    public Sensor<BrickletSegmentDisplay4x7> flashLed() {
        try {
            ledAdditional_setOn();
            send("1.2.:3.‘4.");
            Thread.sleep(128);
            for (int i = 0; i < 9; i++) {
                ledAdditional(i);
                send(LocalDateTime.now());
                Thread.sleep(128);
            }
            send(" ");
            ledAdditional_setOff();
            ledAdditional(5);
        } catch (Exception ignore) {
        }
        return this;
    }

    private void setBrightness(final short value) {
        if (value >= 0 && value <= 7 && brightness != value) {
            brightness = value;
            send(brightness == 0 ? "" : lastText);
        }
    }

    public enum Segments {
        DEFAULT("", 0),
        EMPTY(" ", DEFAULT.segment),
        NULL(null, DEFAULT.segment),

        S0("0", 63),
        S1("1", 6),
        S2("2", 91),
        S3("3", 79),
        S4("4", 102),
        S5("5", 109),
        S6("6", 125),
        S7("7", 7),
        S8("8", 127),
        S9("9", 111),

        SA_1("A", 119),
        SB_1("B", 124),
        SC_1("C", 57),
        SD_1("D", 94),
        SE_1("E", 121),
        SF_1("F", 113),
        SG_1("G", 61),
        SH_1("H", 118),
        SI_1("I", 48),
        SJ_1("J", 30),
        SK_1("K", 117),
        SL_1("L", 56),
        SM_1("M", 85),
        SN_1("N", 55),
        SO_1("O", S0.segment),
        SP_1("P", 115),
        SQ_1("Q", 103),
        SR_1("R", 80),
        SS_1("S", S5.segment),
        ST_1("T", 120),
        SU_1("U", 62),
        SV_1("V", SU_1.segment),
        SW_1("W", 29),
        SX_1("X", SH_1.segment),
        SY_1("Y", 110),
        SZ_1("Z", 82),

        SA_2("a", SA_1.segment),
        SB_2("b", SB_1.segment),
        SC_2("c", 88),
        SD_2("d", 94),
        SE_2("e", SE_1.segment),
        SF_2("f", SF_1.segment),
        SG_2("g", SG_1.segment),
        SH_2("h", 116),
        SI_2("i", SI_1.segment),
        SJ_2("j", SJ_1.segment),
        SK_2("k", SK_1.segment),
        SL_2("l", 24),
        SM_2("m", SM_1.segment),
        SN_2("n", 84),
        SO_2("o", 92),
        SP_2("p", SP_1.segment),
        SQ_2("q", SQ_1.segment),
        SR_2("r", SR_1.segment),
        SS_2("s", SS_1.segment),
        ST_2("t", ST_1.segment),
        SU_2("u", 28),
        SV_2("v", SU_2.segment),
        SW_2("w", SW_1.segment),
        SX_2("x", SX_1.segment),
        SY_2("y", SY_1.segment),
        SZ_2("z", SZ_1.segment),

        MINUS("-", 64),
        EQUALS("=", 72),
        LOWER_THAN("<", 70),
        GREATER_THAN(">", 112),
        SLASH("/", 82),
        BACK_SLASH("\\", 100),
        QUESTION("?", 83),
        SINGLEQUOTE("'", 2),
        PIPE("|", 14),
        BRACKET_RIGHT("]", 15),
        BRACKET_LEFT("[", SC_1.segment),

        COPY_BRACKET_LEFT_1("(", BRACKET_LEFT.segment),
        COPY_BRACKET_LEFT_2("{", BRACKET_LEFT.segment),
        COPY_BRACKET_RIGHT_1(")", BRACKET_RIGHT.segment),
        COPY_BRACKET_RIGHT_2("}", BRACKET_RIGHT.segment),

        EQUALS_TOP(null, 65),
        EQUALS_BOTTOM(null, EQUALS.segment),
        EQUALS_ALL(null, 73),

        MINUS_TOP_MIDDLE(null, EQUALS_TOP.segment),
        MINUS_TOP_MIDDLE_BOTTOM(null, EQUALS_ALL.segment),
        MINUS_TOP(null, 1),
        MINUS_BOTTOM(null, 8),
        MINUS_TOP_LEFT_RIGHT(null, 34),
        MINUS_TOP_BOTTOM(null, 9),

        MINUS_PIPE_TOP_LEFT(null, 96),
        MINUS_PIPE_TOP_RIGHT(null, 3),
        MINUS_MIDDLE_PIPE_TOP_LEFT(null, 66),
        MINUS_MIDDLE_PIPE_BOTTOM_LEFT(null, 80),
        MINUS_MIDDLE_PIPE_BOTTOM_RIGHT(null, 68),
        MINUS_TOP_PIPE_TOP_LEFT(null, 33),
        MINUS_TOP_PIPE_BOTTOM_LEFT(null, 17),
        MINUS_BOTTOM_PIPE_TOP_RIGHT(null, 10),
        MINUS_BOTTOM_PIPE_BOTTOM_LEFT(SL_2.chr, SL_2.segment),
        MINUS_BOTTOM_PIPE_BOTTOM_RIGHT(null, 12),

        PIPE_TOP_LEFT(null, SINGLEQUOTE.segment),
        PIPE_TOP_RIGHT(null, 2),
        PIPE_BOTTOM_LEFT(null, 4),
        PIPE_BOTTOM_RIGHT(null, 16),
        PIPE_TOP_RIGHT_PIPE_BOTTOM_LEFT(null, 18),
        PIPE_TOP_LEFT_PIPE_BOTTOM_RIGHT(null, 18),
        PIPE_BOTTOM_LEFT_RIGHT(null, 20),
        PIPE_LEFT_RIGHT(null, 54),

        S1_MIRROW(null, PIPE.segment),
        S7_MIRROW(null, 49),

        SF_1_MIRROW(null, 71),
        SF_1_UPSIDE_MIRROW(null, 78),
        SL_1_MIRROW(null, 14),
        SG_1_MIRROW(null, 31),
        SG_1_UPSIDE(null, 59),
        SG_1_UPSIDE_MIRROW(null, 47),
        SJ_1_MIRROW(null, 60),
        SJ_1_UPSIDE(null, 39),
        SJ_1_UPSIDE_MIRROW(null, 51),

        SC_2_MIRROW(null, 76),
        SC_2_UPSIDE_MIRROW(null, 67),
        SL_2_UPSIDE_MIRROW(null, 68),
        SU_2_UPSIDE(null, 35),
        ;

        final String chr;
        final short segment;

        Segments(final String chr, final int segment) {
            this.chr = chr;
            this.segment = (short) segment;
        }

        static short get(final char chr) {
            return get(Character.toString(chr));
        }

        static short get(final String chr) {
            for (Segments segment : Segments.values()) {
                if (chr.equals(segment.chr))
                    return segment.segment;
            }
            return 0;
        }
    }

    private short[] toSegments(final char[] chars){
        final short[] result = new short[DIGIT_LIMIT];
        for (int i = 0; i < DIGIT_LIMIT; i++) {
            result[i] = Segments.get(chars[i]);
        }
        return result;
    }

    @Override
    public Sensor<BrickletSegmentDisplay4x7> refreshPeriod(final int milliseconds) {
        return this;
    }
}
