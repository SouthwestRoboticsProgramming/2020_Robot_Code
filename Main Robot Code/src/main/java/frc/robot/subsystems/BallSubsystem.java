/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DigitalInput;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.wpilibj.Counter;

public class BallSubsystem extends SubsystemBase {
  /**
   * The ball subsystem includes the intake motor and solenoids, the belt motor, and the output motor and solenoid.
   * It also includes two sensors used for counting stored balls.
   * The ballCounters are there to ensure that no balls are missed by the sensors.
   */

  private WPI_TalonSRX intakeTalon, beltTalon, outputTalon;
  private Solenoid intakeSolenoid1, intakeSolenoid2, outputSolenoid;
  private DigitalInput ballSensorIn, ballSensorOut;
  private Counter ballCounterIn, ballCounterOut;

  private int intakeTalonPort = 0;
  private int beltTalonPort = 0;
  private int outputTalonPort = 0;

  private int intakeSolenoid1Port = 0;
  private int intakeSolenoid2Port = 0;
  private int outputSolenoidPort = 0;

  private int ballSensorInPort = 0;
  private int ballSensorOutPort = 0;

  //TODO: make it possible to change storedBalls in shuffleboard
  private int storedBalls = 3;
  private final int maxStoredBalls = 5;

  private boolean ballSystemIsForwards = true;

  public BallSubsystem() {
    intakeTalon = new WPI_TalonSRX(intakeTalonPort);
    beltTalon = new WPI_TalonSRX(beltTalonPort);
    outputTalon = new WPI_TalonSRX(outputTalonPort);
  
    intakeTalon.setNeutralMode(NeutralMode.Brake);
    beltTalon.setNeutralMode(NeutralMode.Brake);
    outputTalon.setNeutralMode(NeutralMode.Brake);

    intakeSolenoid1 = new Solenoid(intakeSolenoid1Port);
    intakeSolenoid2 = new Solenoid(intakeSolenoid2Port);
    outputSolenoid = new Solenoid(outputSolenoidPort);

    ballSensorIn = new DigitalInput(ballSensorInPort);
    ballSensorOut = new DigitalInput(ballSensorOutPort);

    ballCounterIn = new Counter(ballSensorIn);
    ballCounterOut = new Counter(ballSensorOut);
  }

  //Intake motor
  public double getIntake() {
    return intakeTalon.get();
  }

  public void setIntake(double x) {
    intakeTalon.set(x);
  }

  public void stopIntake() {
    intakeTalon.stopMotor();
  }

  //Belt motor
  public double getBelt() {
    return beltTalon.get();
  }

  public void setBelt(double x) {
    beltTalon.set(x);

  }

  public void stopBelt() {
    beltTalon.stopMotor();
  }

  //Output motor
  public double getOutput() {
    return outputTalon.get();
  }

  public void setOutput(double x) {
    outputTalon.set(x);
  }

  public void stopOutput() {
    outputTalon.stopMotor();
  }

  //Intake solenoids

  //Output solenoids

  //Ball sensor in
  public boolean getBallSensorIn() {
    return ballSensorIn.get();
  }

  //Ball sensor out
  public boolean getBallSensorOut() {
    return ballSensorOut.get();
  }

  public void periodic() {
  if (ballSystemIsForwards) {

  }
  }
}