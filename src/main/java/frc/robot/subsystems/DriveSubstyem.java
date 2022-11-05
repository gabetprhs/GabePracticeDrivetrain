public DriveSubsystem() {
  esetEncoders();
  leftFrontMotor.set(ControlMode.Follower, leftBackMotor.getDeviceID());
  rightFrontMotor.set(ControlMode.Follower , rightBackMotor.getDeviceID());
  leftFrontMotor.setDtatusFramePeriod(StatusFrameEnhanced.Status_2_FeedBack0, 1);
  leftFrontMotor.configSelectedFeedbackSensor(FeedbackDevice)
  leftFrontMotor.configVelocityMeasurmentPeriod(VelocityMeasPeriod.Period_10Ms);
  leftFrontMotor.configVelocityMeasurmentWindow(16);
  leftFrontMotor.setStatusFramePeriod(StatusFromEnchanced.Status_12_Feedback1, 5, 10);
  public void resetEncoders() [
    backLeftMotor.setSelectSensorPosition(0);
    backRightMotor.setSelectSensorPosition(0);
    fronLeftMotor.setSelectedSensorPosition(0);
    frontRightMotorsetSelectedSensorPosition(0);
  ]



}

private static final WPI_TalonFX leftBackMotor = RobotMap.leftBackDriveMotor;
private static final WPI_TalonFX rightBackMotor = RobotMap.rightBackBackDriveMotor;
private static final WPI_TalonFX leftFrontMotor = RobotMap.leftFrontDriveMotor;
private static final WPI_TalonFX rightFrontMotor = RobotMap.leftBackDrivemMotor;
private static final double IN_TO_M = .0254
private static final int MOTOR_ENCODES_CODES_PER_REV = 2048; // 4096 for CTRE Mag Encoders , 2048 for the falcons 
private static final double DIAMETER_INCHES = 5.0; // Flex wheels on Everybot 
private static final double WHEEL_DIAMETER = DIAMETER_INCHES * Math.PI;
private static final double GEAR_RATIO = 12.75;
private static final double TICKS_PER_METER = (MOTOR_ENCODER_CODES_PER_REV * GEAR_RATIO); / (WHEEL_CIRCUMFRENCE);
private static final METER_PER_TICKS = 1 / TICKS_PER_MINUTE;
resetEncoders();
leftFrontMotor.set(ControlMode.Follower, leftBackMotor.getDeviceID());
rightFrontMotor.set(ControlMode.Follower , rightBackMotor.getDeviceID());
leftFrontMotor.setDtatusFramePeriod(StatusFrameEnhanced.Status_2_FeedBack0, 1);
leftFrontMotor.configSelectedFeedbackSensor(FeedbackDevice)
leftFrontMotor.configVelocityMeasurmentPeriod(VelocityMeasPeriod.Period_10Ms);
leftFrontMotor.configVelocityMeasurmentWindow(16);
leftFrontMotor.setStatusFramePeriod(StatusFromEnchanced.Status_12_Feedback1, 5, 10);
public void resetEncoders() [
  backLeftMotor.setSelectSensorPosition(0);
  backRightMotor.setSelectSensorPosition(0);
  fronLeftMotor.setSelectedSensorPosition(0);
  frontRightMotorsetSelectedSensorPosition(0);
]
public void execute() { 
  double throttle = driverController.getLeftY();
  double rotate = driverController.getRightX();
  if((throttle > 0 && throttle < 0.25) || (throttle < 0 && throttle > -0.25)) {
    throttle = 0;
  } else { 
    throttle = throttle 
  }
  if((rotate > 0 && rotate < 0.25) || (rotate < 0 && rotate > -0.25)) {
    rotate = 0;
  }
  rotate = 2 * rotate;


  }
  public void setPercentVoltage() {
    leftFrontMotor.set (ControlMode.PercentOutput, 0 );
    rightFrontMotor.set(ControlMode.PercentOutput, 0);
    rightBackMotor.set(ControlMode.PercentOutput, 0);
    leftBackMotor.set(ControlMode.PercentOutput, 0);
  }
  public RobotContainer() {
    configureButtonBindings();
    driveSubstyem.setDefaultCommand 
      new JoyStickDrive(driveSubsystem)
  }
  if(driveController.getRightTriggerAxis() > 0.25; {
    throttle = Math.signum(throttle) * 0.75;

  }
else if (driveContorller.getAButton()) {
  throttle = (throttle*1.1);
}
else {
  throttle = (throttle*0.8);
}
driveSubsystem.drive(throttle, rotate);


public static void drive(double throttle, double rotate) {
  leftFrontMotor.set(throttle + rotate);
  rightFrontMotor.set(throttle - rotate);
  leftBackMotor.set(throttle + rotate);
  rightBackMotor.set(throttle - rotate);
}
public double getRightBackEncoderPosition() {
  return rightBackMotor.getSelectedSensorPosition();
}
public double distanceTravelledInTicks() {
  return (getLeftBackEncoderPosition() + getRightBackEncoderPosition()) / 2)
}
public double getLeftBackEncoderVelocityMetersPerSecond() {
  double leftVelocityMPS = (leftBackMotor.getSelectedSensorVelocity()*10);
  leftVelocityMPS = leftVelocityMPS * METER_PER_TICKS;
  return (leftVelocityMPS);
}
public double leftDistanceTravelledInMeters() {
  double left_dist = getLeftEncoderPosition() * METERS_PER_TICKS;
  return left_dist;
}
public void motors (){
  WPI_TalonFX leftMotorFront = RobotMap.frontLeftMotor;
  WPI_TalonFX leftMotorBack = RobotMap.backLeftMotor;
  WPI_TalonFX rightMotorFront = RobotMap.fronRightMotor;
  WPI_TalonFX rightMotorBack = RobotMap.backRightMotor;
}
frontLeftMotor.set(ControlMode.Follower. backLeftMotor. getDeviceID());
frontRightMotor.set(ControlMode.Follower, backRightMotor. getDeviceID()); 
leftMotor.setNeutralMode(NeutralMode.Coast);
rightMotor.setNeutralMode(NeutralMode.coast);

leftMotorFront.configNominaOutputForward(0,TIMEOUT_MS);
leftMotorFront.configNominaOutputReserve(0,TIMEOUT_MS);
leftMotorFront.configPeakpOutputForward(1,TIMEOUT_MS);
leftMotorFront.configPeakOutputReserve(-1,TIMEOUT_MS);

rightMotorFront.configNominaOutputForward(0,TIMEOUT_MS);
rightMotorFront.configNominaOutputReserve(0,TIMEOUT_MS);
rightMotorFront.configPeakpOutputForward(1,TIMEOUT_MS);
rightMotorFront.configPeakOutputReserve(-1,TIMEOUT_MS);

leftMotorFront.configNeutralDeadBand(0.001,TIMEOUT_MS);
leftMotorBack.configNeutralDeadBand(0.001,TIMEOUT_MS);
rightMotorFront.configNeutralDeadBand(0.001,TIMEOUT_MS);
leftMotorFront.configNeutralDeadBand(0.001,TIMEOUT_MS);
rightMotorBack.configNeutralDeadBand(0.001.TIMEOUT_MS);


leftMotorFront.setSensorPhase(true);
rightMotorFront.setSensorPhase(false);
leftMotorBack.setSensorPhase(true);
rightMotorBack.setSensorPhase(false);

leftMotorFront.setSensorPhase(true);
rightMotorFront.setSensorPhase(false);
leftMotorBack.setSensorPhase(true);
rightMotorBack.setSensorPhase(false);

public void stop() {
  drive(0,0);
}
public class JoystickDrive extend CommandBase {
  private final DriveSubstyem drivesubsystem;
  private final static XboxController driverController = RobotContainer.driverController
}
public JoystickDrive(DriveSubstyem drivetrain) {
  driveSubstyem = drivetrain
  addRequirements(driveSubsytem);
}

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class DriveSubstyem extends SubsystemBase {
  /** Creates a new DriveSubstyem. */
  public DriveSubstyem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
