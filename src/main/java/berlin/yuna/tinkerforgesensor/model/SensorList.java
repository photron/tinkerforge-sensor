package berlin.yuna.tinkerforgesensor.model;

import berlin.yuna.tinkerforgesensor.model.sensor.brick.DC;
import berlin.yuna.tinkerforgesensor.model.sensor.brick.IMU;
import berlin.yuna.tinkerforgesensor.model.sensor.brick.IMU2;
import berlin.yuna.tinkerforgesensor.model.sensor.brick.Master;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Accelerometer;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.AccelerometerV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.AirQuality;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Barometer;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.BarometerV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.ButtonRGB;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Default;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.DisplayLcd20x4;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.DisplaySegment;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.DistanceIR;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.DistanceIRV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.DistanceUS;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.DualButton;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Humidity;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.HumidityV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.IO16;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.IO16V2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.LightAmbient;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.LightAmbientV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.LightAmbientV3;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.LightColor;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.LightUv;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.LightUvV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.MotionDetector;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.MotionDetectorV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.RotaryV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Sensor;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.SoundIntensity;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Speaker;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Temperature;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.TemperatureV2;
import berlin.yuna.tinkerforgesensor.model.sensor.bricklet.Tilt;
import berlin.yuna.tinkerforgesensor.model.type.ValueType;
import java.lang.Long;
import java.util.HashMap;

/**
 * Autogenerated with [GeneratorSensorList:generate]
 */
public class SensorList<T extends Sensor> extends SensorListBasic<T> {
  public Sensor getTilt() {
    return getTilt(0);
  }

  public Sensor getTilt(int number) {
    return getSensor(number, Tilt.class);
  }

  public Sensor getTemperature() {
    return getTemperature(0);
  }

  public Sensor getTemperature(int number) {
    return getSensor(number, TemperatureV2.class, Temperature.class);
  }

  public Sensor getSpeaker() {
    return getSpeaker(0);
  }

  public Sensor getSpeaker(int number) {
    return getSensor(number, Speaker.class);
  }

  public Sensor getSoundIntensity() {
    return getSoundIntensity(0);
  }

  public Sensor getSoundIntensity(int number) {
    return getSensor(number, SoundIntensity.class);
  }

  public Sensor getRotary() {
    return getRotary(0);
  }

  public Sensor getRotary(int number) {
    return getSensor(number, RotaryV2.class);
  }

  public Sensor getMotionDetector() {
    return getMotionDetector(0);
  }

  public Sensor getMotionDetector(int number) {
    return getSensor(number, MotionDetectorV2.class, MotionDetector.class);
  }

  public Sensor getMaster() {
    return getMaster(0);
  }

  public Sensor getMaster(int number) {
    return getSensor(number, Master.class);
  }

  public Sensor getLightUv() {
    return getLightUv(0);
  }

  public Sensor getLightUv(int number) {
    return getSensor(number, LightUvV2.class, LightUv.class);
  }

  public Sensor getLightColor() {
    return getLightColor(0);
  }

  public Sensor getLightColor(int number) {
    return getSensor(number, LightColor.class);
  }

  public Sensor getLightAmbient() {
    return getLightAmbient(0);
  }

  public Sensor getLightAmbient(int number) {
    return getSensor(number, LightAmbientV3.class, LightAmbientV2.class, LightAmbient.class);
  }

  public Sensor getIO16() {
    return getIO16(0);
  }

  public Sensor getIO16(int number) {
    return getSensor(number, IO16V2.class, IO16.class);
  }

  public Sensor getIMU2() {
    return getIMU2(0);
  }

  public Sensor getIMU2(int number) {
    return getSensor(number, IMU2.class);
  }

  public Sensor getIMU() {
    return getIMU(0);
  }

  public Sensor getIMU(int number) {
    return getSensor(number, IMU.class);
  }

  public Sensor getHumidity() {
    return getHumidity(0);
  }

  public Sensor getHumidity(int number) {
    return getSensor(number, HumidityV2.class, Humidity.class);
  }

  public Sensor getDualButton() {
    return getDualButton(0);
  }

  public Sensor getDualButton(int number) {
    return getSensor(number, DualButton.class);
  }

  public Sensor getDistanceUS() {
    return getDistanceUS(0);
  }

  public Sensor getDistanceUS(int number) {
    return getSensor(number, DistanceUS.class);
  }

  public Sensor getDistanceIR() {
    return getDistanceIR(0);
  }

  public Sensor getDistanceIR(int number) {
    return getSensor(number, DistanceIRV2.class, DistanceIR.class);
  }

  public Sensor getDisplaySegment() {
    return getDisplaySegment(0);
  }

  public Sensor getDisplaySegment(int number) {
    return getSensor(number, DisplaySegment.class);
  }

  public Sensor getDisplayLcd20x4() {
    return getDisplayLcd20x4(0);
  }

  public Sensor getDisplayLcd20x4(int number) {
    return getSensor(number, DisplayLcd20x4.class);
  }

  public Sensor getDefault() {
    return getDefault(0);
  }

  public Sensor getDefault(int number) {
    return getSensor(number, Default.class);
  }

  public Sensor getDC() {
    return getDC(0);
  }

  public Sensor getDC(int number) {
    return getSensor(number, DC.class);
  }

  public Sensor getButtonRGB() {
    return getButtonRGB(0);
  }

  public Sensor getButtonRGB(int number) {
    return getSensor(number, ButtonRGB.class);
  }

  public Sensor getBarometer() {
    return getBarometer(0);
  }

  public Sensor getBarometer(int number) {
    return getSensor(number, BarometerV2.class, Barometer.class);
  }

  public Sensor getAirQuality() {
    return getAirQuality(0);
  }

  public Sensor getAirQuality(int number) {
    return getSensor(number, AirQuality.class);
  }

  public Sensor getAccelerometer() {
    return getAccelerometer(0);
  }

  public Sensor getAccelerometer(int number) {
    return getSensor(number, AccelerometerV2.class, Accelerometer.class);
  }

  public Long getValueAll() {
    HashMap<Sensor, Long> result = values(ValueType.ALL);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueDummy() {
    HashMap<Sensor, Long> result = values(ValueType.DUMMY);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValuePing() {
    HashMap<Sensor, Long> result = values(ValueType.PING);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueDeviceStatus() {
    HashMap<Sensor, Long> result = values(ValueType.DEVICE_STATUS);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueDeviceConnected() {
    HashMap<Sensor, Long> result = values(ValueType.DEVICE_CONNECTED);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueDeviceReconnected() {
    HashMap<Sensor, Long> result = values(ValueType.DEVICE_RECONNECTED);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueDeviceDisconnected() {
    HashMap<Sensor, Long> result = values(ValueType.DEVICE_DISCONNECTED);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueDeviceTimeout() {
    HashMap<Sensor, Long> result = values(ValueType.DEVICE_TIMEOUT);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueDeviceUnknown() {
    HashMap<Sensor, Long> result = values(ValueType.DEVICE_UNKNOWN);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueEmergencyShutdown() {
    HashMap<Sensor, Long> result = values(ValueType.EMERGENCY_SHUTDOWN);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueDeviceSearch() {
    HashMap<Sensor, Long> result = values(ValueType.DEVICE_SEARCH);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueDeviceAlreadyConnected() {
    HashMap<Sensor, Long> result = values(ValueType.DEVICE_ALREADY_CONNECTED);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueEnvironment() {
    HashMap<Sensor, Long> result = values(ValueType.ENVIRONMENT);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueAirPressure() {
    HashMap<Sensor, Long> result = values(ValueType.AIR_PRESSURE);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueIaqIndex() {
    HashMap<Sensor, Long> result = values(ValueType.IAQ_INDEX);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueHumidity() {
    HashMap<Sensor, Long> result = values(ValueType.HUMIDITY);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTemperature() {
    HashMap<Sensor, Long> result = values(ValueType.TEMPERATURE);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueAltitude() {
    HashMap<Sensor, Long> result = values(ValueType.ALTITUDE);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTilt() {
    HashMap<Sensor, Long> result = values(ValueType.TILT);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueMotionDetected() {
    HashMap<Sensor, Long> result = values(ValueType.MOTION_DETECTED);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueDistance() {
    HashMap<Sensor, Long> result = values(ValueType.DISTANCE);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueSound() {
    HashMap<Sensor, Long> result = values(ValueType.SOUND);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueSoundSpectrumLength() {
    HashMap<Sensor, Long> result = values(ValueType.SOUND_SPECTRUM_LENGTH);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueSoundSpectrumOffset() {
    HashMap<Sensor, Long> result = values(ValueType.SOUND_SPECTRUM_OFFSET);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueBeepActive() {
    HashMap<Sensor, Long> result = values(ValueType.BEEP_ACTIVE);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueSoundIntensity() {
    HashMap<Sensor, Long> result = values(ValueType.SOUND_INTENSITY);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouch() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouch1() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH_1);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouch2() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH_2);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouch3() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH_3);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouch4() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH_4);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouch5() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH_5);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouch6() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH_6);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouch7() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH_7);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouch8() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH_8);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouch9() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH_9);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouch10() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH_10);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouch11() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH_11);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouch12() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH_12);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueTouchProximity() {
    HashMap<Sensor, Long> result = values(ValueType.TOUCH_PROXIMITY);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueLight() {
    HashMap<Sensor, Long> result = values(ValueType.LIGHT);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueLightUv() {
    HashMap<Sensor, Long> result = values(ValueType.LIGHT_UV);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueLightUva() {
    HashMap<Sensor, Long> result = values(ValueType.LIGHT_UVA);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueLightUvb() {
    HashMap<Sensor, Long> result = values(ValueType.LIGHT_UVB);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueLightLux() {
    HashMap<Sensor, Long> result = values(ValueType.LIGHT_LUX);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueColor() {
    HashMap<Sensor, Long> result = values(ValueType.COLOR);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueColorR() {
    HashMap<Sensor, Long> result = values(ValueType.COLOR_R);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueColorG() {
    HashMap<Sensor, Long> result = values(ValueType.COLOR_G);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueColorB() {
    HashMap<Sensor, Long> result = values(ValueType.COLOR_B);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueColorC() {
    HashMap<Sensor, Long> result = values(ValueType.COLOR_C);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueColorRgb() {
    HashMap<Sensor, Long> result = values(ValueType.COLOR_RGB);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueColorLux() {
    HashMap<Sensor, Long> result = values(ValueType.COLOR_LUX);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueColorTemperature() {
    HashMap<Sensor, Long> result = values(ValueType.COLOR_TEMPERATURE);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueImu() {
    HashMap<Sensor, Long> result = values(ValueType.IMU);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueCalibration() {
    HashMap<Sensor, Long> result = values(ValueType.CALIBRATION);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueOrientationHeading() {
    HashMap<Sensor, Long> result = values(ValueType.ORIENTATION_HEADING);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueOrientationRoll() {
    HashMap<Sensor, Long> result = values(ValueType.ORIENTATION_ROLL);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueOrientationPitch() {
    HashMap<Sensor, Long> result = values(ValueType.ORIENTATION_PITCH);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueAccelerationX() {
    HashMap<Sensor, Long> result = values(ValueType.ACCELERATION_X);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueAccelerationY() {
    HashMap<Sensor, Long> result = values(ValueType.ACCELERATION_Y);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueAccelerationZ() {
    HashMap<Sensor, Long> result = values(ValueType.ACCELERATION_Z);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueMagneticX() {
    HashMap<Sensor, Long> result = values(ValueType.MAGNETIC_X);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueMagneticY() {
    HashMap<Sensor, Long> result = values(ValueType.MAGNETIC_Y);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueMagneticZ() {
    HashMap<Sensor, Long> result = values(ValueType.MAGNETIC_Z);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueAngularVelocityX() {
    HashMap<Sensor, Long> result = values(ValueType.ANGULAR_VELOCITY_X);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueAngularVelocityY() {
    HashMap<Sensor, Long> result = values(ValueType.ANGULAR_VELOCITY_Y);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueAngularVelocityZ() {
    HashMap<Sensor, Long> result = values(ValueType.ANGULAR_VELOCITY_Z);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueEulerAngleX() {
    HashMap<Sensor, Long> result = values(ValueType.EULER_ANGLE_X);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueEulerAngleY() {
    HashMap<Sensor, Long> result = values(ValueType.EULER_ANGLE_Y);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueEulerAngleZ() {
    HashMap<Sensor, Long> result = values(ValueType.EULER_ANGLE_Z);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueQuaternionW() {
    HashMap<Sensor, Long> result = values(ValueType.QUATERNION_W);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueQuaternionX() {
    HashMap<Sensor, Long> result = values(ValueType.QUATERNION_X);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueQuaternionY() {
    HashMap<Sensor, Long> result = values(ValueType.QUATERNION_Y);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueQuaternionZ() {
    HashMap<Sensor, Long> result = values(ValueType.QUATERNION_Z);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueLinearAccelerationX() {
    HashMap<Sensor, Long> result = values(ValueType.LINEAR_ACCELERATION_X);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueLinearAccelerationY() {
    HashMap<Sensor, Long> result = values(ValueType.LINEAR_ACCELERATION_Y);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueLinearAccelerationZ() {
    HashMap<Sensor, Long> result = values(ValueType.LINEAR_ACCELERATION_Z);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueGravityVectorX() {
    HashMap<Sensor, Long> result = values(ValueType.GRAVITY_VECTOR_X);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueGravityVectorY() {
    HashMap<Sensor, Long> result = values(ValueType.GRAVITY_VECTOR_Y);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueGravityVectorZ() {
    HashMap<Sensor, Long> result = values(ValueType.GRAVITY_VECTOR_Z);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueEnergy() {
    HashMap<Sensor, Long> result = values(ValueType.ENERGY);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValuePower() {
    HashMap<Sensor, Long> result = values(ValueType.POWER);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueVoltageUsb() {
    HashMap<Sensor, Long> result = values(ValueType.VOLTAGE_USB);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueVoltage() {
    HashMap<Sensor, Long> result = values(ValueType.VOLTAGE);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueCurrent() {
    HashMap<Sensor, Long> result = values(ValueType.CURRENT);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueButton() {
    HashMap<Sensor, Long> result = values(ValueType.BUTTON);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueButtonPressed() {
    HashMap<Sensor, Long> result = values(ValueType.BUTTON_PRESSED);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }

  public Long getValueRotary() {
    HashMap<Sensor, Long> result = values(ValueType.ROTARY);
    return result.isEmpty()? 0L : result.values().iterator().next();
  }
}
